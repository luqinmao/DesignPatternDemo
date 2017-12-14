package com.lqm.designpatterndemo.builder;

/**
 * user：lqm
 * desc：测试类
 */

public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder()
                    .buildOs("Window 10")
                    .buildBoard("英特尔主板")
                    .buildDisplay("Retina显示器");

        System.out.println(builder.create().toString());
    }

}
