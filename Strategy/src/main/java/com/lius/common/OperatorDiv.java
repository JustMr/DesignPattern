package com.lius.common;

/**
 * ConcreteStrategy类
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorDiv extends Operator {

    public int operator(int numA, int numB) throws Exception {

        if (numB == 0) {
            throw new Exception("被除数不能为0");
        }
        return numA / numB;
    }
}
