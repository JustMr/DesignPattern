package com.lius.builder;

import com.lius.product.Product;

/**
 * AbstractBuilder
 * 抽象建造者，Product对象的实现各个部件的抽象接口
 * Created by liushuangbo on 2018/5/3.
 */
public abstract class ComputerBuilder {

    public abstract void builderCPU();

    public abstract void builderMemory();

    public abstract void builderDisk();

    public abstract Product getProduct();

}
