package com.lius.concreteElement;

import com.lius.element.Person;
import com.lius.visitor.Action;

/**
 *
 * Created by liushuangbo on 2018/8/6.
 */
public class Woman extends Person {

    public Woman() {
        this.name = "女人";
    }

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
