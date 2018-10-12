package com.asvacode.phummusic.shared

import com.asvacode.phummusic.BuildConfig
import timber.log.Timber

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:16 PM
 */

object AppLogger {
    fun init() {
        when{
            BuildConfig.DEBUG -> {
                Timber.plant(Timber.DebugTree())
            }
            else ->{
                Timber.plant(object : Timber.Tree() {
                    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                        //TODO  decide what to log in release version
                    }
                })
            }
        }

    }

    fun d(s: String, vararg objects: Any) {
        Timber.d(s, *objects)
    }

    fun d(throwable: Throwable, s: String, vararg objects: Any) {
        Timber.d(throwable, s, *objects)
    }

    fun i(s: String, vararg objects: Any) {
        Timber.i(s, *objects)
    }

    fun i(throwable: Throwable, s: String, vararg objects: Any) {
        Timber.i(throwable, s, *objects)
    }

    fun w(s: String, vararg objects: Any) {
        Timber.w(s, *objects)
    }

    fun w(throwable: Throwable, s: String, vararg objects: Any) {
        Timber.w(throwable, s, *objects)
    }

    fun e(s: String, vararg objects: Any) {
        Timber.e(s, *objects)
    }

    fun e(throwable: Throwable, s: String, vararg objects: Any) {
        Timber.e(throwable, s, *objects)
    }
}
