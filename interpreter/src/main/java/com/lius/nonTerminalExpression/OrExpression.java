package com.lius.nonTerminalExpression;

import com.lius.expression.Expression;

/**
 * OR 非终结符表达式
 * Created by liushuangbo on 2018/8/6.
 */
public class OrExpression implements Expression {

    private Expression exp1 = null;
    private Expression exp2 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
