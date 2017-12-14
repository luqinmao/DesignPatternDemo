package com.lqm.designpatterndemo.command;

/**
 * user：lqm
 * desc：是一个抽象类，类中对需要执行的命令进行声明，一般来说要对外公布一个execute方法用来执行命令。
 */

public abstract class Command {
    public abstract void execute();

}
