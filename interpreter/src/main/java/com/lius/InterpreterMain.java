package com.lius;

import com.lius.expression.Expression;
import com.lius.nonTerminalExpression.AndExpression;
import com.lius.nonTerminalExpression.OrExpression;
import com.lius.terminalExperssion.TerminalExpression;

/**
 * 解释器模式
 * Created by liushuangbo on 2018/8/6.
 */
public class InterpreterMain {

    private static Expression getMaleExpression() {
        Expression xiaoLi = new TerminalExpression("小李");
        Expression xiaoWang = new TerminalExpression("小王");
        return new OrExpression(xiaoLi, xiaoWang);
    }

    private static Expression getMarriedWomanExpression() {
        Expression lili = new TerminalExpression("丽丽");
        Expression married = new TerminalExpression("已婚");
        return new AndExpression(lili, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();

        System.out.println("小李 is male? " + isMale.interpret("小李"));
        System.out.println("丽丽 is a married women? "
                + isMarried.interpret("丽丽已婚"));

    }
}
