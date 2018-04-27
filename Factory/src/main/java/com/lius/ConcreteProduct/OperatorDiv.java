package com.lius.ConcreteProduct;

import com.lius.inter.IOperator;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorDiv extends IOperator {

    public double operate() throws Exception {
        double numA = this.getNumA();
        double numB = this.getNumB();

        if (numB == 0) {
            throw new Exception("被除数不能为0");
        }
        return numA / numB;
    }
}
