package com.lius.hunger;

/**
 * 饿汉式单例模式
 * Created by liushuangbo on 2018/8/1.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public Singleton getInstance() {
        return instance;
    }

}
