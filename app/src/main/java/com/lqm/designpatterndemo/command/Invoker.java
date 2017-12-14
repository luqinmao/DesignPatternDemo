package com.lqm.designpatterndemo.command;

/**
 * user：lqm
 * desc： 调用者，负责调用命令。
 */

public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }

}
