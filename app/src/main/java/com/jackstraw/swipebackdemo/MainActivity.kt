package com.jackstraw.swipebackdemo

import android.content.Intent
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, DemoActivity::class.java))
    }
}
