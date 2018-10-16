package com.asvacode.phummusic.mvp

import android.os.Bundle
import com.asvacode.phummusic.R
import com.asvacode.phummusic.mvp.base.BaseActivity
import com.asvacode.phummusic.shared.manager.NativeManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample_text.text = NativeManager.getAppName()

    }
}