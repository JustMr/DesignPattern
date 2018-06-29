package com.lius.client;

import com.lius.concrete.TestPageA;
import com.lius.abs.TestPage;
import com.lius.concrete.TestPageB;

/**
 * client
 * 模板方法模式：通过尽量将不变的行为提升到父类中完成，去除子类中重复的代码
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中
 * Created by liushuangbo on 2018/4/28.
 */
public class TemplateMain {
    public static void main(String[] args) {
        TestPage testPageA = new TestPageA();
        TestPage testPageB = new TestPageB();

        testPageA.testQuestion1();
        testPageA.testQuestion2();

        testPageB.testQuestion1();
        testPageB.testQuestion2();
    }
}
