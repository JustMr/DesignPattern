package com.lius.cloth;

/**
 * ConcreteDecorator类
 * Created by liushuangbo on 2018/4/25.
 */
public class ShirtCloth extends Cloth {

    public void dress() {
        super.dress();
        System.out.println("穿上衬衫~");
    }
}
