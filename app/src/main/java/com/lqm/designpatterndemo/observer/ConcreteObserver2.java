package com.lqm.designpatterndemo.observer;

/**
 * user：lqm
 * desc：
 */

public class ConcreteObserver2 implements Observer {
    public void update() {
        System.out.println("观察者2收到信息，并进行处理。");
    }
}
