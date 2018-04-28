package com.lius.concrete;

import com.lius.abs.TestPage;

/**
 * 学生A拿到试卷给出自己的答案
 * ConcreteClass
 * Created by liushuangbo on 2018/4/28.
 */
public class TestPageA extends TestPage {
    @Override
    public String testAnswer1() {
        return "喜马拉雅山 ___学生A";
    }

    @Override
    public String testAnswer2() {
        return "国贸 ___学生A";
    }
}
