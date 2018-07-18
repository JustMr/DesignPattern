package com.lius.factory.entity;

import java.io.Serializable;

/**
 * 实体
 * Created by liushuangbo on 2018/5/8.
 */
public class User implements Serializable {

    //姓名
    private String name;
    //年龄
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
