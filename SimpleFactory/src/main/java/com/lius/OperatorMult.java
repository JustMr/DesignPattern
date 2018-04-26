package com.lius;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorMult extends Operator{

    public int operator() {
        return this.getNumA() * this.getNumB();
    }
}
