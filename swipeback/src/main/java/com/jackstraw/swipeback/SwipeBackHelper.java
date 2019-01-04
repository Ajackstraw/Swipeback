package com.jackstraw.swipeback;


import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;

public class SwipeBackHelper {

    private Activity mActivity;
    private SwipeBackLayout mSwipeBackLayout;

    public SwipeBackHelper(Activity activity) {
        mActivity = activity;
    }

    public void onActivityCreate() {
        mActivity.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mActivity.getWindow().getDecorView().setBackgroundDrawable(null);
        mSwipeBackLayout = (SwipeBackLayout) LayoutInflater.from(mActivity).inflate(R.layout.swipeback_layout, null);
        mSwipeBackLayout.addSwipeListener(new SwipeBackLayout.SwipeListener() {
            @Override
            public void onScrollStateChange(int state, float scrollPercent) {
            }

            @Override
            public void onEdgeTouch(int edgeFlag) {
                if(swipeBackListener != null){
                    swipeBackListener.onScrollChange();
                }
                SwipeBackTool.convertActivityToTranslucent(mActivity);
            }

            @Override
            public void onScrollOverThreshold() {
            }
        });
    }

    public void onPostCreate() {
        mSwipeBackLayout.attachToActivity(mActivity);
    }

    public SwipeBackLayout getSwipeBackLayout() {
        return mSwipeBackLayout;
    }

    private SwipeBackInterface swipeBackListener;

    public void setSwipeBackListener(SwipeBackInterface swipeBackListener){
        this.swipeBackListener = swipeBackListener;
    }

}
