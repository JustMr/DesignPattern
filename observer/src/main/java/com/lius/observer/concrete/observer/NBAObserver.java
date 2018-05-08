package com.lius.observer.concrete.observer;

import com.lius.observer.observer.Observer;
import com.lius.observer.subject.Subject;

/**
 * 具体观察者
 * Created by liushuangbo on 2018/5/4.
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    public void update(String msg) {
        super.update(msg);
        System.out.println(name + "不要看球了，" + msg);
    }
}
