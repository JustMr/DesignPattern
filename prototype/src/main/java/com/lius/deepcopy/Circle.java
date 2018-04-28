package com.lius.deepcopy;

/**
 * ConcretePrototype
 * Created by liushuangbo on 2018/4/27.
 */
public class Circle extends IShape {
    @Override
    public void drew() {
        System.out.println("Circle.drew:" + this.type + "画出来了~");
        super.drew();
    }
}
