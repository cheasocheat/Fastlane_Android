package com.asvacode.phummusic.notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.support.v4.app.NotificationCompat
import com.asvacode.phummusic.R
import com.asvacode.phummusic.mvp.MainActivity
import com.asvacode.phummusic.shared.AppLogger
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


/**
 * Created by cheasocheat On 10/15/18.
 */
class NotificationService : FirebaseMessagingService(){
    private var NOTIFICATION_ID = 1

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        if (remoteMessage?.notification != null) {
            AppLogger.d("Title : ${remoteMessage.notification?.title}")
            AppLogger.d("Body : ${remoteMessage.notification?.body}")
            //generateNotification(remoteMessage.notification?.body!!)
        }

        if(remoteMessage?.data!!.isNotEmpty()){
            AppLogger.d("Data : ${remoteMessage.data}")
        }
    }

    private fun generateNotification(messageBody: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT)

        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val mNotifyBuilder = NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Firebase Cloud or Push Notification")
                .setContentText(messageBody)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (NOTIFICATION_ID > 1073741824) {
            NOTIFICATION_ID = 0
        }
        notificationManager.notify(NOTIFICATION_ID++, mNotifyBuilder.build())
    }
}