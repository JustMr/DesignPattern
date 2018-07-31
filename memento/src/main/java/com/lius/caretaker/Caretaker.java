package com.lius.caretaker;

import com.lius.memento.Memento;

/**
 * 备忘录存储器，管理者类
 * Created by liushuangbo on 2018/7/31.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
