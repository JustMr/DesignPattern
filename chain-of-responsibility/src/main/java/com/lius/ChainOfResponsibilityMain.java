package com.lius;

import com.lius.concreteHandler.ConcreteHandler;
import com.lius.concreteHandler.ConcreteHandler1;
import com.lius.concreteHandler.ConcreteHandler2;
import com.lius.handler.Manager;

/**
 * 职责链模式
 * 感觉和状态模式很像啊，状态模式是在判断里去重新初始化下一个负责执行的对象
 * 职责链模式则是在客户端去初始化下一个负责执行的对象
 * 也可以创建一个Request对象，职责链之间就可以通过这个对象流转更多信息
 * Created by liushuangbo on 2018/8/3.
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Manager jingli = new ConcreteHandler();
        Manager zongjian  = new ConcreteHandler1();
        Manager zongjingli = new ConcreteHandler2();

        //经理的上级是总监
        jingli.setManager(zongjian);
        //总监的上级是总经理
        zongjian.setManager(zongjingli);

        System.out.println("第一个审批请求");
        jingli.handlerRequest(25);
        System.out.println("第二个审批请求");
        jingli.handlerRequest(40);

    }
}
