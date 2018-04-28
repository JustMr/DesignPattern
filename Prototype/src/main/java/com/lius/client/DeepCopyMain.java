package com.lius.client;

import com.lius.deepcopy.Circle;
import com.lius.deepcopy.IShape;

/**
 * Client
 * 原型模式：深复制
 * 对对象中的实体或对象也进行复制，而非复制引用
 * 深复制把引用对象的变量执行复制过的新对象，而不是原有的被引用的对象
 * Created by liushuangbo on 2018/4/27.
 */
public class DeepCopyMain {
    public static void main(String[] args) {
        IShape shape = new Circle();
        shape.setType("圆形");
        shape.setParam("50cm^2", "10cm");

        IShape shape1 = null;
        try {
            shape1 = (IShape) shape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        shape1.setType("椭圆");
        shape1.setParam("100cm^2", "40cm");

        shape.drew();
        System.out.println("-------------------");
        shape1.drew();
    }

}
