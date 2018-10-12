package com.ccgo.glapp.application.di.worker

import androidx.work.Worker
import dagger.android.AndroidInjector

/**
 * Created by cheasocheat On 8/14/18.
 */
interface HasWorkerInjector {
    fun workerInjector(): AndroidInjector<Worker>
}