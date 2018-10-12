package com.ccgo.glapp.application.di.worker

/**
 * Created by cheasocheat On 8/14/18.
 */
import androidx.work.Worker
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class WorkerKey(val value: KClass<out Worker>)