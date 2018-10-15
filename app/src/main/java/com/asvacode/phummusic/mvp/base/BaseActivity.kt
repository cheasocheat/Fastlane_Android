package com.asvacode.phummusic.mvp.base

import android.support.v7.app.AppCompatActivity
import com.asvacode.phummusic.R
import com.asvacode.phummusic.mvp.view.BaseView
import com.ccgo.glapp.application.di.injector.Injectable
import org.jetbrains.anko.toast

/**
 * Created by: cheasocheat
 * Date: 10/12/18 3:08 PM
 */

open class BaseActivity : AppCompatActivity(), Injectable, BaseView {

    override fun showMessage(message: String?) {
        if (message == null) {
            toast(getString(R.string.some_err))
        } else {
            toast(message)
        }
    }

}