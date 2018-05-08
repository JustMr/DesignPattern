package com.lius.delegate.event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 事件管理类
 * Created by liushuangbo on 2018/5/8.
 */
public class EventHandler {

    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<Event>();
    }

    public void addEvent(Object object, String methodName, Object[] args) {
        objects.add(new Event(object, methodName, args));
    }

    public void notifyx() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event: this.objects) {
            event.invoke();
        }
    }

}
