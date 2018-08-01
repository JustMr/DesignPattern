package com.lius;

import com.lius.aggregate.ConcreteAggregate;
import com.lius.aggregate.List;
import com.lius.iterator.Iterator;

/**
 * 迭代器模式
 * C# foreach in, Java Iterator foreach 都应用的是迭代器模式
 * Created by liushuangbo on 2018/8/1.
 */
public class IteratorMain {

    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
