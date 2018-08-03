package com.lius.concretecommand;

import com.lius.command.Command;
import com.lius.receiver.Barbecuer;

/**
 * 具体命令
 * Created by liushuangbo on 2018/8/3.
 */
public class ChickenWingCommand extends Command {

    public ChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void notifyTo() {
        this.barbecuer.chickenWing(num);
    }
}
