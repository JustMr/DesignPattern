package com.lius.subject;

import com.lius.observer.Observer;
import com.lius.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者抽象类
 * Created by liushuangbo on 2018/5/4.
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setMsg(String msg) {
        System.out.println("(" + this.action() + ")");
        update(msg);
    }

    public void update(String msg) {
        for (int i =0; i < this.observers.size(); i++) {
            observers.get(i).update(msg);
        }
    }

    public abstract String action();

}
