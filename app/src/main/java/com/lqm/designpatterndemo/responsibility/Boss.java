package com.lqm.designpatterndemo.responsibility;

/**
 * user：lqm
 * desc：各级领导的实现类3
 */

public class Boss extends Leader{

    @Override
    protected int limit(){
        return Integer.MAX_VALUE;
    }

    @Override
    protected void handle(int money){
        System.out.println("老板批复了" + money);
    }
}
