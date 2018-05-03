package com.lius.Concretebuilder;

import com.lius.builder.ComputerBuilder;
import com.lius.product.Product;

/**
 * ConcreteBuilder
 * 具体的组装过程，Product中细节的实现
 * Created by liushuangbo on 2018/5/3.
 */
public class ConcreteComputerBuilder extends ComputerBuilder {

    private Product product;

    public ConcreteComputerBuilder() {
        this.product = new Product();
    }

    @Override
    public void builderCPU() {
        product.add("CPU -- i7-7200HQ");
    }

    @Override
    public void builderMemory() {
        product.add("Memory -- Kingston 32G");
    }

    @Override
    public void builderDisk() {
        product.add("Disk -- Seagate 2T");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }

}
