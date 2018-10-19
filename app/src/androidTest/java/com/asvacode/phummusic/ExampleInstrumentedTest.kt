package com.asvacode.phummusic

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import com.asvacode.phummusic.mvp.MainActivity
import org.junit.Assert.assertEquals
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.locale.LocaleTestRule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleInstrumentedTest {

    companion object {
        @get:ClassRule //@get: to make it public
        val localeTestRule = LocaleTestRule()
    }

    //Preferred JUnit 4 mechanism of specifying the activity to be launched before each test
    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)


//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getTargetContext()
//        assertEquals("com.asvacode.phummusic", appContext.packageName)
//    }

    @Test
    fun screenShots(){
        Screengrab.screenshot("before_login_click")

        Espresso.onView(ViewMatchers.withId(R.id.btnSample)).perform(ViewActions.click())

        Screengrab.screenshot("after_login_click")
    }
}
