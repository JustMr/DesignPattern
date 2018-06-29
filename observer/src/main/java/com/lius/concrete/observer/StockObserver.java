package com.lius.concrete.observer;

import com.lius.observer.Observer;
import com.lius.subject.Subject;

/**
 *
 * Created by liushuangbo on 2018/5/4.
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    public void update(String msg) {
        super.update(msg);
        System.out.println(name + "不要炒股了，" + msg);
    }
}
