package com.lius.observer;

import com.lius.subject.Subject;

/**
 *
 * Created by liushuangbo on 2018/6/29.
 */
public class Observer {

    public String name;
    public Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update(String msg){
        System.out.println(msg);
    }
}
