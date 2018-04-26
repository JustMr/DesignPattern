package com.lius.decorator;

/**
 * Created by liushuangbo on 2018/4/25.
 */
public class ConcreteDecorator1 extends Decorator {
    public void operator() {
        super.operator();
        System.out.println("装了桌子装沙发~");
    }
}
