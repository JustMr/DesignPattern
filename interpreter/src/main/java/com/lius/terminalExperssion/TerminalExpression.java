package com.lius.terminalExperssion;

import com.lius.expression.Expression;

/**
 * 终结符表达式
 * Created by liushuangbo on 2018/8/6.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
