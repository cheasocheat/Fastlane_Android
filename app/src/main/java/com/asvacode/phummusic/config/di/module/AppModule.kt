package com.asvacode.phummusic.config.di.module

import android.app.Application
import android.content.Context
import com.asvacode.phummusic.shared.manager.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:55 PM
 */
@Module
class AppModule (private val app: Application) {
    @Provides
    fun provideApplicationContext(): Context = app


    @Provides
    @Singleton
    fun provideDataManager(context: Context): PreferenceManager = PreferenceManager(context)

}