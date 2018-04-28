package com.lius.common;

/**
 * Strategy类
 * Created by liushuangbo on 2018/4/25.
 */
abstract public class Operator {

    public int operator(int numA, int numB) throws Exception {

        numA = 0;
        numB = 0;
        return numA + numB;
    }
}
