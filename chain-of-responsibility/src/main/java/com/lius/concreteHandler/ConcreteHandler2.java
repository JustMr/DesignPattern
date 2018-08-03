package com.lius.concreteHandler;

import com.lius.handler.Manager;

/**
 * 具体处理类
 * Created by liushuangbo on 2018/8/3.
 */
public class ConcreteHandler2 extends Manager {
    @Override
    public void handlerRequest(int request) {
        if (request>=20 && request <30) {
            System.out.println("在可接受范围之内，总经理同意了");
        } else {
            System.out.println("我是审批链的顶端，我不同意！");
        }
    }
}
