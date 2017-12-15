package com.lqm.designpatterndemo.observer;

/**
 * user：lqm
 * desc：具体的被观察者
 */

public class ConcreteSubject extends Subject {
    public void doSomething() {
        System.out.println("被观察者事件反生");
        this.notifyObserver();
    }
}
