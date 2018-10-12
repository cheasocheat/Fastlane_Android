package com.asvacode.phummusic.config.di.provider

import com.asvacode.phummusic.config.di.module.scope.MainScope
import com.asvacode.phummusic.mvp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:55 PM
 */

@Module
abstract class ActivityProvider{
    @MainScope
    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity

}