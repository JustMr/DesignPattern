package com.lius.strategy;

import com.lius.common.OperatorAdd;
import com.lius.common.OperatorDiv;
import com.lius.common.OperatorMinus;
import com.lius.common.OperatorMult;

import java.util.Scanner;

/**
 * 策略模式
 * Created by liushuangbo on 2018/4/25.
 */
public class StrategyMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入操作(+、-、*、/)：");
        String signal = in.nextLine();
        System.out.println("请输入整数：");
        int _numA = in.nextInt();
        System.out.println("请输入整数：");
        int _numB = in.nextInt();

        if (signal == null || signal.equals("")) {
            System.out.println("操作符号有误！");
        }

        OperatorContext operator = null;
        switch (signal) {
            case "+":
                operator = new OperatorContext(new OperatorAdd());
                break;
            case "-":
                operator = new OperatorContext(new OperatorMinus());
                break;
            case "*":
                operator = new OperatorContext(new OperatorMult());
                break;
            case "/":
                operator = new OperatorContext(new OperatorDiv());
                break;
        }

        try {
            int res = operator.operator(_numA,_numB);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
