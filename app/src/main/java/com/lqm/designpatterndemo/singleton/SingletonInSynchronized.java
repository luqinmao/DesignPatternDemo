package com.lqm.designpatterndemo.singleton;

/**
 * user：lqm
 * desc：在多线程情况下保证单例对象唯一性
 */

public class SingletonInSynchronized {

    private static SingletonInSynchronized singleton;

    private SingletonInSynchronized(){}

    public static synchronized SingletonInSynchronized getInstance(){
        if(singleton == null){
            singleton = new SingletonInSynchronized();
        }
        return singleton;
    }


}
