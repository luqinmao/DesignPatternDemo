package com.lqm.designpatterndemo.state;

/**
 * user：lqm
 * desc：
 */
public class TvController implements PowerController {

    private TvState mTvState;

    @Override
    public void powerOn() {
        mTvState = new PowerOnState();
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        mTvState = new PowerOffState();
        System.out.println("关机");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
