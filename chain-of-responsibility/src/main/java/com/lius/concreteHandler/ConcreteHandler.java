package com.lius.concreteHandler;

import com.lius.handler.Manager;

/**
 * 具体处理类
 * Created by liushuangbo on 2018/8/3.
 */
public class ConcreteHandler extends Manager {
    @Override
    public void handlerRequest(int request) {
        if (request>0 && request <10) {
            System.out.println("在可承受范围之内，经理同意了");
        } else if (request >= 10){
            System.out.println("经理无法接受，需上级审批");
            if (this.manager != null) {
                this.manager.handlerRequest(request);
            }
        } else {
            System.out.println("你怎么会有这种想法？！");
        }
    }
}
