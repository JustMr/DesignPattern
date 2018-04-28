package com.lius.decorator;

/**
 * Created by liushuangbo on 2018/4/25.
 */
public class ConcreteComponent extends Component {

    private String name;

    public ConcreteComponent() {}

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("为" + this.name + "装饰~");
    }
}
