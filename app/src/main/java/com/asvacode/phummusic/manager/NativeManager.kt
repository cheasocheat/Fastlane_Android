package com.asvacode.phummusic.manager

/**
 * Created by: cheasocheat
 * Date: 10/12/18 2:06 PM
 */

object NativeManager {
    /**
     * Load Native CPP file
     * Do no remove these line
     */
    init {
        System.loadLibrary("native")
    }

    external fun getAppName(): String
}