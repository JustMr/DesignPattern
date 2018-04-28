package com.lius.decorator;

/**
 * 这个类是装饰模式最重要的部分
 * 它通过setDecorator 来对需要扩展的对象进行包装
 * 通过operator实现扩展的功能
 * Created by liushuangbo on 2018/4/25.
 */
abstract public class Decorator extends Component {

    protected Component component;

    public void setDecorator(Component component) {
        this.component = component;
    }

    public void operator() {
        if (this.component != null) {
            component.operator();
        }
    }

}
