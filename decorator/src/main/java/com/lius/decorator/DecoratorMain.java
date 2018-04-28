package com.lius.decorator;

/**
 * 装饰模式
 * Created by liushuangbo on 2018/4/25.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        //为谁装饰
        ConcreteComponent cc = new ConcreteComponent("三居室");
        //装饰什么
        ConcreteDecorator cd = new ConcreteDecorator();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1();

        //为三居室装修
        cd.setDecorator(cc);
        //为三居室增加家具
        cd1.setDecorator(cd);

        //结果按照实例化的顺序完成对象的操作
        cd1.operator();
    }
}
