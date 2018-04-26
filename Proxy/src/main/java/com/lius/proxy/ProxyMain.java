package com.lius.proxy;

/**
 * 代理模式
 * Client类
 * Created by liushuangbo on 2018/4/26.
 */
public class ProxyMain {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        landlord.setRent(850.00);
        Medium medium = new Medium("李明", landlord);

        medium.rent();

    }
}
