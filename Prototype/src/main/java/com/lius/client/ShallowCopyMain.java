package com.lius.client;

import com.lius.shallowcopy.Circle;
import com.lius.shallowcopy.IShape;

/**
 * Client
 * 原型模式：浅复制，使用clone方法复制
 * 浅复制仅能复制值类型，对值类型字段逐位复制
 * 如果字段是引用类型，则复制的是引用而不是复制引用的对象
 * 因此原始对象及其副本引用的是一个对象
 * Created by liushuangbo on 2018/4/27.
 */
public class ShallowCopyMain {
    public static void main(String[] args) {
        IShape shape = new Circle();
        shape.setType("圆形");
        shape.setParam("50cm^2", "10cm");

        IShape shape1 = (IShape) shape.clone();
        shape1.setType("椭圆");
        shape1.setParam("200cm^2", "80cm");

        shape.drew();
        shape1.drew();
    }

}
