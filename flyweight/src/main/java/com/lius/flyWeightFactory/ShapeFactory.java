package com.lius.flyWeightFactory;

import com.lius.concreteFlyWeight.Circle;
import com.lius.flyWeight.Shape;

import java.util.Hashtable;

/**
 * 享元工厂
 * Created by liushuangbo on 2018/8/3.
 */
public class ShapeFactory {
    private static final Hashtable<String, Object> shapes = new Hashtable<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapes.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapes.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
