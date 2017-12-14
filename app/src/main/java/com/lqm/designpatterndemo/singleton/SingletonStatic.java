package com.lqm.designpatterndemo.singleton;

/**
 * user：lqm
 * desc：静态内部类单例模式:
 *       当第一次加载Singleton类时并不会初始化slnstance，只有在第一次调用Singleton的getlnstance
 *       方法时才会导致slnstance被初始化。
 *       因此，第一次调用getlnstance方法会导致虚拟机加载SingletonHolder类，这种方式不仅能够确保线程安全，
 *       也能够保证单例对象的唯一性，同时也延迟了单例的实例化，
 *       所以这是何洪辉老师推荐使用的单例模式实现方式。
 */

public class SingletonStatic {

    private SingletonStatic(){}

    public static SingletonStatic getInstance(){
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final SingletonStatic sInstance = new SingletonStatic();
    }


}
