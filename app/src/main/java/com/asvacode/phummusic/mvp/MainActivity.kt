package com.asvacode.phummusic.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.asvacode.phummusic.R
import com.asvacode.phummusic.manager.NativeManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample_text.text = NativeManager.getAppName().toString()
    }
}
