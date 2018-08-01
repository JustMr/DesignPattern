package com.lius.leaf;

import com.lius.component.Company;

/**
 * HR部门
 * Created by liushuangbo on 2018/8/1.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        //已是叶节点，不做增加节点操作
    }

    @Override
    public void remove(Company c) {
        //已是叶节点，不做删除节点操作
    }

    @Override
    public void display(int depth) {
        for (int i=0; i<depth; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
