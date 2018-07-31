package com.lius;

import com.lius.caretaker.Caretaker;
import com.lius.memento.Memento;
import com.lius.originator.Originator;

/**
 * 备忘录模式
 * Created by liushuangbo on 2018/7/31.
 */
public class MementoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        //初始化发起人状态
        originator.initOriginator();

        //创建存储器
        Caretaker caretaker = new Caretaker();
        //创建备忘录并保存在存储器中
        caretaker.setMemento(originator.createMemento());

        //显示当前状态
        originator.displayMemento();

        //更改当前状态
        originator.setState("20");
        originator.displayMemento();

        //还原备忘录中状态
        originator.setMemento(caretaker.getMemento());
        originator.displayMemento();

    }
}
