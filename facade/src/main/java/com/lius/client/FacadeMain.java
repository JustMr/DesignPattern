package com.lius.client;

import com.lius.facade.ComputerFacade;

/**
 * 外观模式
 * Created by liushuangbo on 2018/5/2.
 */
public class FacadeMain {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
        System.out.println("Do something~~~");
        facade.end();
    }
}
