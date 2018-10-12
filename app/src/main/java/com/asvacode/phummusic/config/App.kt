package com.asvacode.phummusic.config

import android.app.Activity
import android.app.Application
import com.asvacode.phummusic.shared.AppLogger
import com.ccgo.glapp.application.di.injector.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:43 PM
 */

class App : Application(), HasActivityInjector{
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        this.initAppLogger()
        this.initAppComponent()
        //this.initLeakCanary()
        //this.initFabric()
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    /**
     * Other Configuration Part
     */
    //Todo : Init Log Level
    private fun initAppLogger() {
        AppLogger.init()
    }

    //TODO : AppComponent Injection
    private fun initAppComponent() = AppInjector.init(this)
}