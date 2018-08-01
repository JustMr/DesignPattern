package com.lius.aggregate;

import com.lius.iterator.Iterator;

/**
 * 容器
 * Created by liushuangbo on 2018/8/1.
 */
public interface List {

    void add(Object o);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
