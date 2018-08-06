package com.lius.concreteElement;

import com.lius.element.Person;
import com.lius.visitor.Action;

/**
 *
 * Created by liushuangbo on 2018/8/6.
 */
public class Man extends Person {

    public Man() {
        this.name = "男人";
    }

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
