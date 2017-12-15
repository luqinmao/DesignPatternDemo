package com.lqm.designpatterndemo.abstractfactory;

/**
 * user：lqm
 * desc：抽象工厂
 */

public class Test {

    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
