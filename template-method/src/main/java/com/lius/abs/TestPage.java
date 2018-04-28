package com.lius.abs;

/**
 * 试卷
 * AbstractClass
 * 可以将模板方法设置为final，从而保证不会被重写
 * Created by liushuangbo on 2018/4/28.
 */
public abstract class TestPage {

    public final void testQuestion1() {
        System.out.println("世界第一高山是？");
        System.out.println("答案是：" + testAnswer1());
    }

    public abstract String testAnswer1();

    public final void testQuestion2() {
        System.out.println("北京CBD在哪？");
        System.out.println("答案是：" + testAnswer2());
    }

    public abstract String testAnswer2();


}
