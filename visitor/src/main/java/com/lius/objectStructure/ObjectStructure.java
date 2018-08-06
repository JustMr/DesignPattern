package com.lius.objectStructure;

import com.lius.element.Person;
import com.lius.visitor.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * Created by liushuangbo on 2018/8/6.
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    //添加
    public void attach(Person element) {
        elements.add(element);
    }

    //删除
    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        for (Person person :
                elements) {
            person.accept(visitor);
        }
    }

}
