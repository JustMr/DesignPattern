package com.lius.strategyfactory;


import com.lius.common.*;

/**
 * Context类
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorContext {

    private Operator operator = null;

    public OperatorContext(String signal) throws Exception {

        if (signal == null || signal.equals("")) {
            throw new Exception("操作符号有误！");
        }
        switch (signal) {
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorMinus();
                break;
            case "*":
                operator = new OperatorMult();
                break;
            case "/":
                operator = new OperatorDiv();
                break;
        }
    }


    public int operator(int numA, int numB) throws Exception {
        int result = 0;
        if (operator != null) {
            return operator.operator(numA, numB);
        }

        return result;
    }

}
