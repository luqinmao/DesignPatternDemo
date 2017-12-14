package com.lqm.designpatterndemo.state;

/**
 * user：lqm
 * desc：电视状态接口，定义了电视操作的函数
 */

public interface TvState{
    public void nextChannel();
    public void prevChannel();
    public void turnUp();
    public void turnDown();
}
