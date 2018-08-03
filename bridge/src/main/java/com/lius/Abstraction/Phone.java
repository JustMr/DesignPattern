package com.lius.Abstraction;

import com.lius.implementor.Software;

/**
 * 手机抽象类
 * Created by liushuangbo on 2018/8/2.
 */
public abstract class Phone {

    protected Software software;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();

}
