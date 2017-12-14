package com.lqm.designpatterndemo.strategy;

/**
 * user：lqm
 * desc：加速取值策略
 */

public class AccelerateInterpolator implements Interpolator {
    @Override
    public float getInterpolation(float input) {
        return input *input;
    }
}
