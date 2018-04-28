package com.lius.ConcreteCreator;

import com.lius.ConcreteProduct.OperatorMinus;
import com.lius.inter.IFactory;
import com.lius.inter.IOperator;

/**
 * ConcreteCreator类
 * Created by liushuangbo on 2018/4/27.
 */
public class FactoryMinus implements IFactory {
    @Override
    public IOperator createFactory() {
        return new OperatorMinus();
    }
}
