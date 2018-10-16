package com.asvacode.phummusic.shared.manager

import android.app.NotificationManager
import android.content.Context

/**
 * Created by cheasocheat On 10/16/18.
 */
object NotificationUtils {

    /**
     * Clear notification tray message
     */
    fun clearNotifications(context : Context){
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.cancelAll()
    }
}