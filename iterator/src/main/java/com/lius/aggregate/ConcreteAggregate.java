package com.lius.aggregate;

import com.lius.iterator.ConcreteIterator;
import com.lius.iterator.Iterator;

/**
 * 具体容器
 * Created by liushuangbo on 2018/8/1.
 */
public class ConcreteAggregate implements List {

    private Object[] objects;
    private int count = 0;

    public ConcreteAggregate() {
        objects = new Object[100];
    }

    @Override
    public void add(Object o) {
        objects[count] = o;
        count++;
    }

    @Override
    public Object get(int index) {
        if (index >= count || count < 0) {
            throw new IndexOutOfBoundsException("下标越界了...");
        }
        return objects[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return count;
    }
}
