package com.lius.factory.iproduct;

import com.lius.factory.entity.Department;

/**
 * 抽象产品类
 * Created by liushuangbo on 2018/5/8.
 */
public interface IDepartment {

    void insertDepartment(Department department);

    Department getDepartmentByName(String name);

}
