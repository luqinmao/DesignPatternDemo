package com.lqm.designpatterndemo.strategy;

/**
 * user：lqm
 * desc：匀速取值策略
 */

public class LinearInterpolator implements Interpolator{
    @Override
    public float getInterpolation(float input) {
        return input;
    }
}
