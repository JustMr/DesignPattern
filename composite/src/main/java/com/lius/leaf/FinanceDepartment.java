package com.lius.leaf;

import com.lius.component.Company;

/**
 * 财务部
 * Created by liushuangbo on 2018/8/1.
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        for (int i=0; i<depth;i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "公司财务管理");
    }
}
