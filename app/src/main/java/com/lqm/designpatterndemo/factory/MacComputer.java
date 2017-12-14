package com.lqm.designpatterndemo.factory;

/**
 * user：lqm
 * desc：具体的产品类，可以有多个，重写抽象方法，定义业务逻辑
 */

public class MacComputer extends Computer {
    @Override
    public void open() {
        System.out.println("打开苹果电脑");
    }
}

//public class LenovoComputer extends Computer{
//    @Override
//    public void open(){
//        System.out.println("打开联想电脑");
//    }
//}
//
//public class AlienComputer extends Computer{
//    @Override
//    public void open(){
//        System.out.println("打开外星人电脑");
//    }
//}
