package com.lqm.designpatterndemo.state;

/**
 * user：lqm
 * desc：状态模式
 */

public class Test {
    public static void main(String[] args){
        TvController controller = new TvController();
        controller.powerOn();
        controller.turnUp();
        controller.nextChannel();
        controller.powerOff();
        controller.turnDown();//关机之后不能调音量、换频道
        controller.prevChannel();
    }
}
