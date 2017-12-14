package com.lqm.designpatterndemo.prototype;

import java.util.ArrayList;

/**
 * user：lqm
 * desc：原型类
 */

public class Prototype implements Cloneable{

    private String text;
    private ArrayList list = new ArrayList();

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.text = this.text; //浅拷贝
            prototype.list = (ArrayList) this.list.clone(); //深拷贝
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }

}
