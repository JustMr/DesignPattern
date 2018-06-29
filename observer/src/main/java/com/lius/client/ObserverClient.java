package com.lius.client;

import com.lius.concrete.subject.BossSubject;
import com.lius.concrete.subject.SecretarySubject;
import com.lius.concrete.observer.NBAObserver;
import com.lius.concrete.observer.StockObserver;
import com.lius.subject.Subject;

/**
 * 观察者模式
 * 观察者模式又叫发布-订阅模式，这样就可以简单理解为一个人（或多个人）发送消息（通知），多个人接受（观察）
 * 于是有了通知者和观察者
 * 在通知者中调用观察者的更新方法去更新观察者的状态
 * 观察者也可以获取通知者提供的信息
 * 我们将通知者和观察者抽象化，通过抽象耦合将其具体实现对象解耦
 * 我们的例子借用《大话设计模式》中观察者模式，老板和职员的故事
 * Created by liushuangbo on 2018/5/4.
 */
public class ObserverClient {
    public static void main(String[] args) {
        Subject bossSubject = new BossSubject();
        bossSubject.setType("boss");

        NBAObserver xiaoli = new NBAObserver("小李", bossSubject);
        StockObserver xiaowang = new StockObserver("小王", bossSubject);

        bossSubject.addObserver(xiaoli);
        bossSubject.addObserver(xiaowang);
        //没发现小李
        bossSubject.removeObserver(xiaoli);
        bossSubject.setMsg("我大老板在这了！");

        System.out.println("------------------------------------");

        Subject secretarySubject = new SecretarySubject();
        secretarySubject.setType("secretary");

        NBAObserver xiaoli1 = new NBAObserver("小李", secretarySubject);
        StockObserver xiaowang1 = new StockObserver("小王", secretarySubject);

        secretarySubject.addObserver(xiaoli1);
        secretarySubject.addObserver(xiaowang1);

        secretarySubject.setMsg("老板回来了！");

    }
}
