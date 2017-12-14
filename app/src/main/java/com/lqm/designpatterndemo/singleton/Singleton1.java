package com.lqm.designpatterndemo.singleton;

/**
 * user：lqm
 * desc：饿汉式：声明对象时就已经初始化
 */

public class Singleton1 {

    private static final Singleton1 singleton = new Singleton1();

    private Singleton1(){}//构造函数私有

    public static Singleton1 getInstance(){
        return singleton;
    }

}
