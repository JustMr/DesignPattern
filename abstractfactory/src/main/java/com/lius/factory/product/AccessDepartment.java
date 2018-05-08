package com.lius.factory.product;

import com.lius.factory.entity.Department;
import com.lius.factory.iproduct.IDepartment;

/**
 * 具体产品类
 * 通过Access操作Department表
 * Created by liushuangbo on 2018/5/8.
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("通过Access插入一条Department记录");
    }

    @Override
    public Department getDepartmentByName(String name) {
        System.out.println("使用Access通过name查询一条Department记录");
        return null;
    }
}
