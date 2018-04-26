package com.lius.proxy;

/**
 * 中介
 * Proxy类
 * Created by liushuangbo on 2018/4/26.
 */
public class Medium implements Pay {

    //房客
    private Tenant tenant;

    public Medium(String name, Landlord landlord) {
        this.tenant = new Tenant(name, landlord);
    }

    public void rent() {
        if (tenant != null) {
            tenant.rent();
        }
    }

}
