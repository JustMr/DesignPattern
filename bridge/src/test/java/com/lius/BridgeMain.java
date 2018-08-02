package com.lius;

import com.lius.Abstraction.Phone;
import com.lius.ConcreteImplementor.Game;
import com.lius.ConcreteImplementor.NoteBook;
import com.lius.RefinedAbstraction.HUAWEIPhone;
import com.lius.implementor.Software;

/**
 * 桥接模式
 * 桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化。
 * 桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量。
 * Created by liushuangbo on 2018/8/2.
 */
public class BridgeMain {
    public static void main(String[] args) {
        Software noteBook = new NoteBook();
        Software game = new Game();

        Phone hw = new HUAWEIPhone();
        hw.setSoftware(noteBook);
        hw.run();

        hw.setSoftware(game);
        hw.run();
    }
}
