package com.lqm.designpatterndemo.builder;

/**
 * user：lqm
 * desc：建一个Builder类
 */

public class Builder {

    private Computer mComputer = new Computer();

//    public Builder() {
//        mComputer = new Computer();
//    }

    public Builder buildBoard(String board){
        mComputer.setBoard(board);
        return this;
    }

    public Builder buildDisplay(String display){
        mComputer.setDisplay(display);
        return this;
    }

    public Builder buildOs(String os){
        mComputer.setOs(os);
        return this;
    }

    public Computer create(){
        return mComputer;
    }

}
