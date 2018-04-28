package com.lius;


/**
 * 像一个工厂一样生产想要的对象
 * Created by liushuangbo on 2018/4/25.
 */
public class OperatorFactory {

    public static Operator createFactory(String signal) throws Exception {
        Operator operator = null;
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
            default:
                operator = new Operator();
        }

        return operator;
    }

}
