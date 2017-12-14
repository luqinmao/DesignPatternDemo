package com.lqm.designpatterndemo.builder;

/**
 * user：lqm
 * desc：建一个实体类
 */

public class Computer {
    private String mBoard;
    private String mDiaplay;
    private String mOs;

    /*
     * 主板
     */
    public void setBoard(String board){
        mBoard = board;
    }

    /*
     * 显示器
     */
    public void setDisplay(String display){
        mDiaplay = display;
    }

    /*
     * 操作系统
     */
    public void setOs(String os){
        mOs = os;
    }

    @Override
    public String toString(){
        return mOs + " " + mBoard + " " + mDiaplay;
    }
}
