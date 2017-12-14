package com.lqm.designpatterndemo.factory;

/**
 * user：lqm
 * desc：工厂的具体实现类，负责创建并返回具体产品对象
 */

public class ComputerFactory extends Factory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        try{
            computer = (Computer)Class.forName(clz.getName()).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return (T)computer;
    }
}
