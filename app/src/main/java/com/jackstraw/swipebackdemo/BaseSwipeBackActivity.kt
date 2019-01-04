package com.jackstraw.swipebackdemo

import android.os.Bundle
import com.jackstraw.swipeback.SwipeBackInterface
import com.jackstraw.swipeback.SwipeBackHelper
import com.jackstraw.swipeback.SwipeBackLayout
import com.jackstraw.swipeback.SwipeBackTool

open class BaseSwipeBackActivity : BaseActivity(), SwipeBackInterface {

    private lateinit var mHelper: SwipeBackHelper

    private fun enableSwipeBack(): Boolean = true

    private fun initSwipeBack() {
        setSwipeBackEnable(enableSwipeBack())
        swipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mHelper = SwipeBackHelper(this)
        mHelper.onActivityCreate()
        mHelper.setSwipeBackListener(this)
        initSwipeBack()
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        mHelper.onPostCreate()
    }

    override fun getSwipeBackLayout(): SwipeBackLayout {
        return mHelper.swipeBackLayout
    }

    override fun setSwipeBackEnable(enable: Boolean) {
        swipeBackLayout.setEnableGesture(enable)
    }

    override fun onScrollChange() {

    }
}