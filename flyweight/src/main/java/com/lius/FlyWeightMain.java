package com.lius;

import com.lius.concreteFlyWeight.Circle;
import com.lius.flyWeightFactory.ShapeFactory;

/**
 * 享元模式
 * 在享元模式中可以共享的相同内容称为 内部状态(Intrinsic State)，
 * 而那些需要外部环境来设置的不能共享的内容称为 外部状态(Extrinsic State)，
 * 其中外部状态和内部状态是相互独立的，外部状态的变化不会引起内部状态的变化。
 * 享元模式的本质是分离与共享 ： 分离变与不变，并且共享不变.
 * 在享元模式中通常会出现工厂模式，需要创建一个享元工厂来负责维护一个享元池(Flyweight Pool)（用于存储具有相同内部状态的享元对象）。
 * Created by liushuangbo on 2018/8/3.
 */
public class FlyWeightMain {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
