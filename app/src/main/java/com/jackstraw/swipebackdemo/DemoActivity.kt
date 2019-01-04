package com.jackstraw.swipebackdemo

import android.os.Bundle
import android.util.Log

class DemoActivity : BaseSwipeBackActivity() {

    private val Tag : String = "DemoActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Tag, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag, "onStop")
    }

    override fun finish() {
        super.finish()
        Log.d(Tag, "finish")
    }

    override fun onScrollChange() {
        Log.d(Tag, "onScrollChange")
    }
}
