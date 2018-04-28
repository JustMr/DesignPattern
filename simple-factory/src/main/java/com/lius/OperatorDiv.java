package com.lius;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorDiv extends Operator {

    public int operator() throws Exception {
        int numA = this.getNumA();
        int numB = this.getNumB();

        if (numB == 0) {
            throw new Exception("被除数不能为0");
        }
        return numA / numB;
    }
}
