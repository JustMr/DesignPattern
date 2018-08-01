package com.lius.lazy;

/**
 * 懒汉式单例模式
 * Created by liushuangbo on 2018/8/1.
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
