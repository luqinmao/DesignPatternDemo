package com.lqm.designpatterndemo.strategy;

/**
 * user：lqm
 * desc：策略模式
 */

public class Test {
    public static void main(String[] args) {
        // LinearInterpolator interpolator = new LinearInterpolator();
        AccelerateInterpolator interpolator = new AccelerateInterpolator();
        for (int i = 0; i < 10; i++) {
            System.out.print(interpolator.getInterpolation(i) + " ");
        }
    }

}
