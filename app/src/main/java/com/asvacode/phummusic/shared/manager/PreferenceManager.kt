package com.asvacode.phummusic.shared.manager

import android.content.Context
import com.asvacode.phummusic.shared.PreferenceHelper
import com.asvacode.phummusic.shared.get
import com.asvacode.phummusic.shared.set
import javax.inject.Inject

class PreferenceManager @Inject constructor(context: Context) {

    companion object {
        const val POPULATE_DATA = "populated_data"
    }

    private var prefs = PreferenceHelper.instance(context)

    fun setValue(key: String, value: Any) {
        prefs[key] = value
    }

    fun getValue(key: String, default: Any?): Any? {
        return when (default) {
            is String? -> {
                val data: String? = prefs[key, default]
                data
            }
            is Int? -> {
                val data: Int? = prefs[key, default]
                data
            }
            is Boolean? -> {
                val data: Boolean? = prefs[key, default]
                data
            }
            is Float -> {
                val data: Float? = prefs[key, default]
                data
            }
            is Long -> {
                val data: Long? = prefs[key, default]
                data
            }
            else -> {
                throw UnsupportedOperationException("Not yet implemented")
            }
        }
    }
}