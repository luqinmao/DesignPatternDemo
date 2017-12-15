package com.lqm.designpatterndemo.observer;

/**
 * user：lqm
 * desc：观察者模式
 */

public class Test {

    public static void main(String[] args){
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1()); //添加观察者1
        sub.addObserver(new ConcreteObserver2()); //添加观察者2
        sub.doSomething();
    }

}
