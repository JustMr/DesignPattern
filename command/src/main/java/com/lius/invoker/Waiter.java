package com.lius.invoker;

import com.lius.command.Command;
import com.lius.concretecommand.ChickenWingCommand;
import com.lius.concretecommand.MuttonCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 * Created by liushuangbo on 2018/8/3.
 */
public class Waiter {

    private List<Command> orders;

    public Waiter() {
        orders = new ArrayList<>();
    }

    /**
     * 增加订单
     * @param command 订单项
     */
    public void setCommand(Command command) {
        if (command instanceof ChickenWingCommand){
            System.out.println("对不起，没有鸡翅了，请点其他的吧~~~");
        } else {
            orders.add(command);
            if (command instanceof MuttonCommand) {
                System.out.println("已将您的"+ command.getNum() + "串羊肉串记录~~~");
            }
        }


    }

    public void cancelBBQ(Command command) {
        orders.remove(command);
        if (command instanceof MuttonCommand) {
            System.out.println("取消了"+command.getNum() + "串羊肉串");
        }else
            System.out.println("取消了一个订单");
    }

    public void notifyToBBQ() {
        for (Command command: orders) {
            command.notifyTo();
        }
    }
}
