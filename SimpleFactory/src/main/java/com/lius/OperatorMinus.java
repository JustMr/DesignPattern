package com.lius;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorMinus extends Operator {

    public int operator() {
        int numA = this.getNumA();
        int numB = this.getNumB();

        return numA - numB;
    }
}
