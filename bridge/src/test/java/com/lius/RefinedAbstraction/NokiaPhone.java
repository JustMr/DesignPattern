package com.lius.RefinedAbstraction;

import com.lius.Abstraction.Phone;

/**
 * Created by liushuangbo on 2018/8/2.
 */
public class NokiaPhone extends Phone {
    @Override
    public void run() {
        this.software.run("诺基亚");
    }
}
