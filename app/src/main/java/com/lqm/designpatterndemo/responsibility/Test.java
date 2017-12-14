package com.lqm.designpatterndemo.responsibility;

/**
 * user：lqm
 * desc：责任链模式
 *       模仿报销流程，经理、总监、老板，每级领导有限额报销限额，
 *       在限额内可以报销，在限额外要交给上级领导处理：
 */

public class Test {

    public static void main(String[] args){
        //各就位
        Manager manager = new Manager();
        Director director = new Director();
        Boss boss = new Boss();
        //设置上下级关系
        manager.nextHandler = director;
        director.nextHandler = boss;
        //发起请求
        manager.handleRequest(50000);
    }

}
