package com.lius.originator;

import com.lius.memento.Memento;

/**
 * 发起人类
 * Created by liushuangbo on 2018/7/31.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void displayMemento() {
        System.out.println("状态：" + state);
    }

    public void initOriginator() {
        state = "100";
    }

}
