package com.lius.mediator;

import com.lius.colleague.Country;

/**
 * 抽象中介者类
 * 联合国机构类
 * Created by liushuangbo on 2018/8/3.
 */
public abstract class UnitedNations {

    public abstract void declare(String message, Country colleague);

}
