package com.lius.observer.observer;

import com.lius.observer.subject.Subject;

/**
 * 观察者抽象类
 * Created by liushuangbo on 2018/5/4.
 */
public abstract class Observer {

    protected Subject subject;

    protected String name;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update(String msg){
        if (subject.getType().equals("boss")) {
            System.out.println("老板说：");
        } else {
            System.out.println("柜台发微信：");
        }
    }

}
