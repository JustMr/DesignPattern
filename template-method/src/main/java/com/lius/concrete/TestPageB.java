package com.lius.concrete;

import com.lius.abs.TestPage;

/**
 * 学生B拿到试卷给出自己的答案
 * ConcreteClass
 * Created by liushuangbo on 2018/4/28.
 */
public class TestPageB extends TestPage {
    @Override
    public String testAnswer1() {
        return "泰山 ___学生B";
    }

    @Override
    public String testAnswer2() {
        return "三里屯 ___学生B";
    }
}
