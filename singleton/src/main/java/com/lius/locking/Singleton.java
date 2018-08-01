package com.lius.locking;

/**
 * 双重校验锁法
 * double-check locking
 * Created by liushuangbo on 2018/8/1.
 */
public class Singleton {

    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
