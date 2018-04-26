package com.lius.strategy;

import com.lius.common.Operator;

/**
 * Context类 负责创建不同的策略
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorContext {

    private Operator operator = null;

    public OperatorContext(Operator operator) {
        this.operator = operator;
    }

    public int operator(int numA, int numB) throws Exception {
        int result = 0;
        if (operator != null) {
            result = operator.operator(numA, numB);
        }
        return result;
    }

}
