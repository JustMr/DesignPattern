package com.lius.proxy;

import java.util.Random;

/**
 * 中介
 * Proxy类
 * 代理模式与装饰模式类似
 * 装饰模式强调扩展
 * 代理模式强调限制，可以决定被代理对象行为的执行
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
            Random random = new Random();
            if (random.nextBoolean()) {
                tenant.rent();
            } else {
                System.out.println("还没到交租时间~");
            }
        }
    }

}
