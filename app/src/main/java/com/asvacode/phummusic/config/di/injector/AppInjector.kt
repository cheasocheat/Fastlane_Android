package com.ccgo.glapp.application.di.injector

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.asvacode.phummusic.config.App
import com.asvacode.phummusic.config.di.component.AppComponent
import com.asvacode.phummusic.config.di.component.DaggerAppComponent
import com.asvacode.phummusic.config.di.module.AppModule
import dagger.android.AndroidInjection

class AppInjector {
    companion object {
        lateinit var appComponent: AppComponent

        fun init (app: App): AppComponent {
            appComponent = DaggerAppComponent.builder()
                    .appModule(AppModule(app))
                    .build()

            appComponent.inject(app)

            val value: Application.ActivityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
                override fun onActivityPaused(activity: Activity?) {}

                override fun onActivityResumed(activity: Activity?) {}

                override fun onActivityStarted(activity: Activity?) {}

                override fun onActivityDestroyed(activity: Activity?) {}

                override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

                override fun onActivityStopped(activity: Activity?) {}

                override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
                    if (activity is Injectable) {
                        AndroidInjection.inject(activity)
                    }
                }
            }

            app.registerActivityLifecycleCallbacks(value)

            return appComponent

        }

    }

}