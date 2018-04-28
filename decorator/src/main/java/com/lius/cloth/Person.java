package com.lius.cloth;

/**
 * 被“装饰”的对象
 * ConcreteComponent和Component合并
 * Created by liushuangbo on 2018/4/25.
 */
public class Person {

    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public void dress() {
        System.out.println(name + "先穿上内衣~");
    }

}
