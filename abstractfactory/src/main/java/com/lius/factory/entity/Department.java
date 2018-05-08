package com.lius.factory.entity;

import java.io.Serializable;

/**
 * 实体
 * Created by liushuangbo on 2018/5/8.
 */
public class Department implements Serializable {

    //部门名称
    private String name;
    //部门经理
    private String manage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }
}
