package com.lius.RefinedAbstraction;

import com.lius.Abstraction.Phone;

/**
 * 抽象扩展类
 * Created by liushuangbo on 2018/8/2.
 */
public class NokiaPhone extends Phone {
    @Override
    public void run() {
        this.software.run("诺基亚手机");
    }
}
