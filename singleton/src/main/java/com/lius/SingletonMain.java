package com.lius;

import com.lius.locking.Singleton;

/**
 * 单例模式分为懒汉式和饿汉式
 * 可以使用二重校验法解决线程安全问题
 * Created by liushuangbo on 2018/8/1.
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }

    }

}
