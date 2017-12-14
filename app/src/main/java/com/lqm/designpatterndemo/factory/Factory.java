package com.lqm.designpatterndemo.factory;

/**
 * user：lqm
 * desc：
 */

public abstract class Factory {
    /**
     * 某电脑类型的工厂方法
     *
     * @param clz 电脑的类型
     *
     * @return 具体型号的电脑对象
     */
    public abstract <T extends Computer> T createComputer(Class<T> clz);

}
