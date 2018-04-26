package com.lius.proxy;

import com.sun.org.apache.bcel.internal.generic.LAND;

/**
 * 房客
 * RealSubject类
 * Created by liushuangbo on 2018/4/26.
 */
public class Tenant implements Pay {

    private String name;

    private Landlord landlord;

    public Tenant(String name, Landlord landlord) {
        this.name = name;
        this.landlord = landlord;
    }

    public void rent() {
        System.out.println(name + "向房东交房租" + landlord.getRent() + "元");
    }

}
