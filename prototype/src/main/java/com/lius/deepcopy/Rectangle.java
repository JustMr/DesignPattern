package com.lius.deepcopy;

/**
 * ConcretePrototype
 * Created by liushuangbo on 2018/4/27.
 */
public class Rectangle extends IShape {
    @Override
    public void drew() {
        System.out.println("Rectangle.drew:" + this.type + "画出来了~");
        super.drew();
    }
}
