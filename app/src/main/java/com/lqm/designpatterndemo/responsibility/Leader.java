package com.lqm.designpatterndemo.responsibility;

/**
 * user：lqm
 * desc：领导抽象类
 */

public abstract class Leader{

    protected Leader nextHandler;//上一级领导

    /**
     * 处理报账请求
     *
     * @param money 请求报销的数量
     */
    public void handleRequest(int money){
        if(limit() < money){
            if(nextHandler != null){
                nextHandler.handleRequest(money);
            }
        }else{
            handle(money);
        }
    }

    /**
     * 自身能批复的额度权限
     *
     * @return 额度
     */
    protected abstract int limit();

    /**
     * 处理报销行为
     *
     * @param money 具体金额
     */
    protected abstract void handle(int money);
}
