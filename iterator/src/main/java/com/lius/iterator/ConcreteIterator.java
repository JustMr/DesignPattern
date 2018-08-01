package com.lius.iterator;

import com.lius.aggregate.ConcreteAggregate;
import com.lius.aggregate.List;

/**
 * 具体迭代器
 * Created by liushuangbo on 2018/8/1.
 */
public class ConcreteIterator implements Iterator {

    private List list = null;
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        list = aggregate;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < list.getSize()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        index++;
        return list.get(index-1);
    }
}
