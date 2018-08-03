package com.lius.colleague;

import com.lius.mediator.UnitedNations;

/**
 * 抽象同事类
 * Created by liushuangbo on 2018/8/3.
 */
public abstract class Country {

    protected UnitedNations unitedNations;
    protected String msg;

    public Country(UnitedNations unitedNations, String msg) {
        this.unitedNations = unitedNations;
        this.msg = msg;
    }

    public abstract void sendMessage();

    public abstract void getMessage(String message);
}
