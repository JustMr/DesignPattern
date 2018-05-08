package com.lius.delegate.observer;

import java.util.Date;

/**
 * 具体观察者
 * Created by liushuangbo on 2018/5/8.
 */
public class WatchingTVListener {

    public WatchingTVListener() {
        System.out.println("Watching TV");
    }

    public void stopWatching(Date date) {
        System.out.println("Stop Watching TV" + date);
    }

}
