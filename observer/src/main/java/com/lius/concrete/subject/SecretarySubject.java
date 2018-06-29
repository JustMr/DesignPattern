package com.lius.concrete.subject;

import com.lius.subject.Subject;

/**
 * 具体通知者
 * Created by liushuangbo on 2018/5/4.
 */
public class SecretarySubject extends Subject {


    @Override
    public String action() {
        return "柜台赶紧通知大家，老板回来了";
    }
}
