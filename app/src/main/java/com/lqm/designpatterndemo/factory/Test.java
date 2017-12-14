package com.lqm.designpatterndemo.factory;

/**
 * user：lqm
 * desc：
 */

public class Test {

    public static void main(String[] args){

        Factory factory = new ComputerFactory();

        MacComputer mac = factory.createComputer(MacComputer.class);
        mac.open();
    }

}
