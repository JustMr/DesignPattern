package com.lius;

import com.lius.command.Command;
import com.lius.concretecommand.ChickenWingCommand;
import com.lius.concretecommand.MuttonCommand;
import com.lius.invoker.Waiter;
import com.lius.receiver.Barbecuer;

/**
 * 命令模式
 * 命令模式是对功能方法的抽象，并不是对对象的抽象。
 * 命令模式是将功能提升到对象来操作，以便对多个功能进行一系列的处理以及封装。
 * Created by liushuangbo on 2018/8/3.
 */
public class CommandMain {
    public static void main(String[] args) {
        //需要有一个烧烤师傅
        Barbecuer barbecuer = new Barbecuer();

        //想好了菜单，创建命令
        Command mutton = new MuttonCommand(barbecuer);
        mutton.setNum(6);
        Command mutton1 = new MuttonCommand(barbecuer);
        mutton1.setNum(10);
        Command chichenWing = new ChickenWingCommand(barbecuer);
        chichenWing.setNum(10);

        //把想好的菜单告诉服务员
        Waiter waiter = new Waiter();
        waiter.setCommand(mutton);
        waiter.setCommand(mutton1);
        waiter.setCommand(chichenWing);
        waiter.cancelBBQ(mutton);

        //将菜单告诉厨师
        waiter.notifyToBBQ();

    }
}
