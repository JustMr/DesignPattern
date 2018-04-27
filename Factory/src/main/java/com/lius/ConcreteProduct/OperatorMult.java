package com.lius.ConcreteProduct;

import com.lius.inter.IOperator;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorMult extends IOperator {

    public double operate() {
        return this.getNumA() * this.getNumB();
    }
}
