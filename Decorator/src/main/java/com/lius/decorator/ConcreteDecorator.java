package com.lius.decorator;

/**
 * Created by liushuangbo on 2018/4/25.
 */
public class ConcreteDecorator extends Decorator {

    public void operator() {
        super.operator();
        System.out.println("吊好屋顶，刷好墙~");
    }
}
