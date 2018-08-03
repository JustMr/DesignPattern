package com.lius.concreteColleage;

import com.lius.colleague.Country;
import com.lius.mediator.UnitedNations;

/**
 * 具体同事类
 * Created by liushuangbo on 2018/8/3.
 */
public class Canada extends Country {

    public Canada(UnitedNations unitedNations, String msg) {
        super(unitedNations, msg);
    }

    @Override
    public void sendMessage() {
        this.unitedNations.declare(this.msg, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("加拿大得到对方的消息为："+message);
    }
}
