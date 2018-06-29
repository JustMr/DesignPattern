package com.lius.client;

import com.lius.director.ComputerDirector;
import com.lius.Concretebuilder.ConcreteComputerBuilder;
import com.lius.builder.ComputerBuilder;
import com.lius.product.Product;

/**
 * Client
 * 建造者模式
 * 是当创建复杂对象的算法应该独立该对象的组成部分以及他们的装配方式时适用的模式
 * 我的理解就是将建造的细节抽离，保证可以实现不同细节的同时保证所有的细节不被遗漏
 * Created by liushuangbo on 2018/5/3.
 */
public class BuilderMain {
    public static void main(String[] args) {

        //我们也可以创建多个ConcreteComputer，去生产不同细节的计算机
        ComputerBuilder computer = new ConcreteComputerBuilder();
        Product product = ComputerDirector.builderComputer(computer);
        try {
            product.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
