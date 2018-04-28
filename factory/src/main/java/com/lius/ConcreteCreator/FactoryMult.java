package com.lius.ConcreteCreator;

import com.lius.ConcreteProduct.OperatorMult;
import com.lius.inter.IFactory;
import com.lius.inter.IOperator;

/**
 * ConcreteCreator类
 * Created by liushuangbo on 2018/4/27.
 */
public class FactoryMult implements IFactory {
    @Override
    public IOperator createFactory() {
        return new OperatorMult();
    }
}
