package com.lius;

import com.lius.concreteElement.Man;
import com.lius.concreteElement.Woman;
import com.lius.concreteVisitor.Success;
import com.lius.objectStructure.ObjectStructure;

/**
 * 访问者模式
 * Created by liushuangbo on 2018/8/6.
 */
public class VisitorMain {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success success = new Success();
        o.display(success);

    }

}
