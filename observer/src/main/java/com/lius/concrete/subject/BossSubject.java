package com.lius.concrete.subject;

import com.lius.subject.Subject;

/**
 *
 * Created by liushuangbo on 2018/5/4.
 */
public class BossSubject extends Subject {

    @Override
    public String action() {
        return "老板回来了，柜台没有机会通知大家";
    }
}
