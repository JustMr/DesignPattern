package com.lius.cloth;

/**
 * Decorator类
 * Created by liushuangbo on 2018/4/25.
 */
public class Cloth extends Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void dress() {
        if (person != null) {
            this.person.dress();
        }
    }

}
