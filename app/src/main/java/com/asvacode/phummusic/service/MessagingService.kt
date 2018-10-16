package com.asvacode.phummusic.service

import com.asvacode.phummusic.shared.AppLogger
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Created by cheasocheat On 10/16/18.
 */
class MessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage?) {
        AppLogger.d("===> ${message?.from}")
    }
}