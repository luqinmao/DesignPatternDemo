package com.lqm.designpatterndemo.iterator;

/**
 * user：lqm
 * desc：
 */

public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator iterator();
}
