package com.lqm.designpatterndemo.responsibility;

/**
 * user：lqm
 * desc：各级领导的实现类2
 */

public class Director extends Leader{

    @Override
    protected int limit(){
        return 20000;
    }

    @Override
    protected void handle(int money){
        System.out.println("总监批复了" + money);
    }
}
