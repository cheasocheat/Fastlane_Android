package com.asvacode.phummusic.mvp

import android.os.Bundle
import android.view.View
import com.asvacode.phummusic.R
import com.asvacode.phummusic.manager.NativeManager
import com.asvacode.phummusic.mvp.base.BaseActivity
import com.asvacode.phummusic.shared.AppLogger
import com.google.firebase.messaging.FirebaseMessaging
import com.pusher.pushnotifications.PushNotifications
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val TOPIC = "JavaSampleApproach"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample_text.text = NativeManager.getAppName()

        //Command to push via terminal
        //curl -H "Content-Type: application/json" -H "Authorization: Bearer 69965C8908DE7B951A71864134E55901E2013504B8A285CC7A4D2FD853820662" -X POST "https://80779c18-ed93-4875-b5ec-a0dd52c036f6.pushnotifications.pusher.com/publish_api/v1/instances/80779c18-ed93-4875-b5ec-a0dd52c036f6/publishes" -d '{"interests":["hello"],"fcm":{"notification":{"title":"Hello","body":"Hello, world!"}}}'

        //Using Pusher to push notification from pusher publish
        //PushNotifications.start(applicationContext, "80779c18-ed93-4875-b5ec-a0dd52c036f6")
        // PushNotifications.subscribe("hello")
        //btnSubscribe.setOnClickListener(onClickListener)
        //btnUnsubscribe.setOnClickListener(onClickListener)
        FirebaseMessaging.getInstance().subscribeToTopic(TOPIC)
        this.showMessage("Subscribed")
    }
}