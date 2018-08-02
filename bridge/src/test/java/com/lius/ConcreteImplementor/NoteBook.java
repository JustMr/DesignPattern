package com.lius.ConcreteImplementor;

import com.lius.implementor.Software;

/**
 * 软件实现类
 * Created by liushuangbo on 2018/8/2.
 */
public class NoteBook extends Software {
    @Override
    public void run(String phone) {
        System.out.println(phone + "中记事本开始工作...");
    }
}
