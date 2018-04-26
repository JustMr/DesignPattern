package com.lius.strategyfactory;

/**
 * 简单工厂模式和策略模式结合
 * Created by liushuangbo on 2018/4/25.
 */
public class StrategyMain {
    public static void main(String[] args) {
        try {
            OperatorContext add = new OperatorContext("+");
            int res = add.operator(5,4);
            System.out.println(res);

            OperatorContext muis = new OperatorContext("-");
            res = muis.operator(5,4);
            System.out.println(res);

            OperatorContext unDefin = new OperatorContext("AB");
            res = unDefin.operator(5,4);
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
