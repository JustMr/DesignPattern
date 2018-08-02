package com.lius.RefinedAbstraction;

import com.lius.Abstraction.Phone;

/**
 * 扩展抽象类
 * Created by liushuangbo on 2018/8/2.
 */
public class HUAWEIPhone extends Phone {
    @Override
    public void run() {
        this.software.run("华为");
    }
}
