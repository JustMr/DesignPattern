package com.lius.delegate.client;

import com.lius.delegate.observer.PlayGameListener;
import com.lius.delegate.observer.WatchingTVListener;
import com.lius.delegate.subject.ConcreteNotifier;
import com.lius.delegate.subject.Notifier;

import java.util.Date;

/**
 * 因为每个观察者的更新方法不尽相同，不一定均是update()方法
 * 所以我们需要一种方法来实现不同对象的不同方法的更新动作
 * C#中有关键字delegate实现时间委托，而在JAVA中，则通过反射来实现
 * 此例子来源于博客 https://www.cnblogs.com/wanshiming/p/8241876.html
 * Created by liushuangbo on 2018/5/7.
 */
public class DelegateMain {

    public static void main(String[] args) {
        PlayGameListener playGameListener = new PlayGameListener();
        WatchingTVListener watchingTVListener = new WatchingTVListener();

        Notifier notifier = new ConcreteNotifier();
        notifier.addListener(playGameListener, "stopPlaying", new Date());
        notifier.addListener(watchingTVListener, "stopWatching", new Date());
        notifier.notifyx();

    }
}
