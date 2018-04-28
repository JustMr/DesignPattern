package com.lius.inter;

/**
 * Product接口
 * Created by liushuangbo on 2018/4/26.
 */
abstract public class IOperator {

    private Double numA;
    private Double numB;

    public IOperator() {
        numA = 0.00;
        numB = 0.00;
    }

    public Double getNumA() {
        return numA;
    }

    public void setNumA(Double numA) {
        this.numA = numA;
    }

    public Double getNumB() {
        return numB;
    }

    public void setNumB(Double numB) {
        this.numB = numB;
    }

    abstract public double operate() throws Exception;
}
