package com.lius.concreteVisitor;

import com.lius.concreteElement.Man;
import com.lius.concreteElement.Woman;
import com.lius.visitor.Action;

/**
 * 成功
 *
 * Created by liushuangbo on 2018/8/6.
 */
public class Success implements Action {

    private final static String SUCCESS = "成功";

    @Override
    public void getManConclusion(Man man) {
        System.out.println("当"+man.getName()+SUCCESS+"时，~~~~~");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("当"+woman.getName()+SUCCESS+"时，~~~~~");
    }
}
