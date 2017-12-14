package com.lqm.designpatterndemo.prototype;

/**
 * user：lqm
 * desc：原型模式测试类
 */

public class Test {

    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }

}
