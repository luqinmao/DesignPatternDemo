package com.lqm.designpatterndemo.singleton;

/**
 * user：lqm
 * desc：懒汉式 ：声明一个静态对象，并且在用户第一次调用getInstance时进行初始化
 */

public class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2(){}

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
