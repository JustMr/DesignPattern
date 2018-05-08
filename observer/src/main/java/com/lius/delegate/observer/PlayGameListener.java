package com.lius.delegate.observer;

import java.util.Date;

/**
 * 具体观察者
 * Created by liushuangbo on 2018/5/8.
 */
public class PlayGameListener {

    public PlayGameListener() {
        System.out.println("Playing Game");
    }

    public void stopPlaying(Date date) {
        System.out.println("Stop Playing Game" + date);
    }

}
