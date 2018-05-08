package com.lius.reflect.client;

import com.lius.factory.entity.Department;
import com.lius.factory.entity.User;
import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;
import com.lius.reflect.factory.DataAccess;

import javax.xml.crypto.Data;

/**
 * 通过反射和简单工厂模式来简化抽象工厂模式中的创建工厂
 * Created by liushuangbo on 2018/5/8.
 */
public class ReflectMain {

    public static void main(String[] args) {
        try {
            IUser iUser = DataAccess.createUser();
            iUser.insertUser(new User());
            iUser.getUserByName("haojian");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        try {
            IDepartment iDepartment = DataAccess.createDepartment();
            iDepartment.insertDepartment(new Department());
            iDepartment.getDepartmentByName("baobutong");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }

}
