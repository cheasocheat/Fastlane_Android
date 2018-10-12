package com.asvacode.phummusic.config.di.component

import com.asvacode.phummusic.config.App
import com.asvacode.phummusic.config.di.module.AppModule
import com.asvacode.phummusic.config.di.provider.ActivityProvider
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:50 PM
 */

@Singleton

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityProvider::class
])
interface AppComponent {
    fun inject(application: App)
}