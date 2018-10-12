package com.asvacode.phummusic.config.di.worker

import androidx.work.Worker
import com.ccgo.glapp.application.di.worker.HasWorkerInjector

/**
 * Created by cheasocheat On 8/14/18.
 */
object AndroidWorkerInjection {

    fun inject(worker: Worker) {
        checkNotNull(worker) { "worker" }
        val application = worker.applicationContext
        if (application !is HasWorkerInjector) {
            throw RuntimeException("${application.javaClass.canonicalName} does not implement ${HasWorkerInjector::class.java.canonicalName}")
        }

        val workerInjector = (application as HasWorkerInjector).workerInjector()
        checkNotNull(workerInjector) { "${application.javaClass}.workerInjector() return null" }
        workerInjector.inject(worker)
    }
}