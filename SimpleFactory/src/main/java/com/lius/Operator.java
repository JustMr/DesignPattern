package com.lius;

/**
 *
 * Created by liushuangbo on 2018/4/25.
 */
public class Operator {

    private int numA;
    private int numB;

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int operator() throws Exception {
        numA = 0;
        numB = 0;
        return numA + numB;
    }
}
