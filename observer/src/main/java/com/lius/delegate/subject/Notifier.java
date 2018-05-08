package com.lius.delegate.subject;

import com.lius.delegate.event.EventHandler;

/**
 * 抽象通知类
 * Created by liushuangbo on 2018/5/8.
 */
public abstract class Notifier {

    EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object, String method, Object... args);

    public abstract void notifyx();

}
