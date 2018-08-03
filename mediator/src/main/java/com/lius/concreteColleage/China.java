package com.lius.concreteColleage;

import com.lius.colleague.Country;
import com.lius.mediator.UnitedNations;

/**
 * 具体同事类
 * Created by liushuangbo on 2018/8/3.
 */
public class China extends Country {

    public China(UnitedNations unitedNations, String msg) {
        super(unitedNations, msg);
    }

    @Override
    public void sendMessage() {
        this.unitedNations.declare(this.msg, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("中国获得对方消息为：" + message);
    }
}
