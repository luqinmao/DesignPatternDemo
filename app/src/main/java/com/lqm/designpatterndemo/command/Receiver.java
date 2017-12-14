package com.lqm.designpatterndemo.command;

/**
 * user：lqm
 * desc：接收者，负责接收命令并且执行命令。
 */

public class Receiver {

    public void doSomething(){
        System.out.println("接受者-业务逻辑处理");
    }

}
