package com.lqm.designpatterndemo.responsibility;

/**
 * user：lqm
 * desc：各级领导的实现类1
 */

public class Manager extends Leader{

    @Override
    protected int limit(){
        return 5000;
    }

    @Override
    protected void handle(int money){
        System.out.println("经理批复了" + money);
    }
}
