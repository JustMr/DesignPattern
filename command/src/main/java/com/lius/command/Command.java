package com.lius.command;

import com.lius.receiver.Barbecuer;

/**
 * 抽象命令
 * Created by liushuangbo on 2018/8/3.
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    protected int num;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public abstract void notifyTo();
}
