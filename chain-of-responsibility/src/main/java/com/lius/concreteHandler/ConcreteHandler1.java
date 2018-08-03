package com.lius.concreteHandler;

import com.lius.handler.Manager;

/**
 * 具体处理类
 * Created by liushuangbo on 2018/8/3.
 */
public class ConcreteHandler1 extends Manager {
    @Override
    public void handlerRequest(int request) {
        if(request >= 10 && request <20) {
            System.out.println("在可承受范围之内，总监同意了");
        } else {
            System.out.println("总监无法接受，需上级进行审批");
            if (this.manager != null) {
                this.manager.handlerRequest(request);
            }
        }
    }
}
