package com.lius.visitor;

import com.lius.concreteElement.Man;
import com.lius.concreteElement.Woman;

/**
 *
 * Created by liushuangbo on 2018/8/6.
 */
public interface Action {

    void getManConclusion(Man man);

    void getWomanConclusion(Woman woman);
}
