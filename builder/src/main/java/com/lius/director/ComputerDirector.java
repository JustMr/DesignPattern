package com.lius.director;

import com.lius.builder.ComputerBuilder;
import com.lius.product.Product;

/**
 * Director
 * 指挥者
 * 1.隔离用户和Product对象的生产过程
 * 2.可以控制Product的生产过程
 * Created by liushuangbo on 2018/5/3.
 */
public class ComputerDirector {

    public static Product builderComputer(ComputerBuilder computer) {
        computer.builderCPU();
        computer.builderMemory();
        computer.builderDisk();
        return computer.getProduct();
    }

}
