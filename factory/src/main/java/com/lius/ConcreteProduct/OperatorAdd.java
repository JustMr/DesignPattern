package com.lius.ConcreteProduct;

import com.lius.inter.IOperator;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorAdd extends IOperator {

    public double operate() {
        double numA = this.getNumA();
        double numB = this.getNumB();

        return numA + numB;
    }
}
