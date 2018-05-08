package com.lius.delegate.subject;

import java.lang.reflect.InvocationTargetException;

/**
 * 具体通知者
 * Created by liushuangbo on 2018/5/8.
 */
public class ConcreteNotifier extends Notifier {
    @Override
    public void addListener(Object object, String method, Object... args) {
        this.getEventHandler().addEvent(object, method, args);
    }

    @Override
    public void notifyx() {
        try {
            this.getEventHandler().notifyx();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
