package com.jackstraw.swipeback;

public interface SwipeBackInterface {

    SwipeBackLayout getSwipeBackLayout();

    void setSwipeBackEnable(boolean enable);

    void onScrollChange();
}
