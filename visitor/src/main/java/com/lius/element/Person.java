package com.lius.element;

import com.lius.visitor.Action;

/**
 * Element
 * Created by liushuangbo on 2018/8/6.
 */
public abstract class Person {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(Action visitor);

}
