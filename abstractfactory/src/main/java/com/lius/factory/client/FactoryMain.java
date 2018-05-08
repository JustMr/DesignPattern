package com.lius.factory.client;

import com.lius.factory.entity.Department;
import com.lius.factory.entity.User;
import com.lius.factory.factory.AccessFactory;
import com.lius.factory.factory.SQLServerFactory;
import com.lius.factory.ifactory.IDBFactory;
import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;
import com.lius.factory.product.AccessUser;

/**
 * 抽象工厂模式
 * 借鉴《大话设计模式》中抽象工厂的例子，虚拟一个访问不同数据连接的例子
 * Created by liushuangbo on 2018/5/8.
 */
public class FactoryMain {

    public static void main(String[] args) {

        //通过Access操作User表
        IDBFactory factory = new AccessFactory();
        IUser iUser = factory.createUser();
        iUser.insertUser(new User());
        iUser.getUserByName("zhangsan");

        //通过SQL Server操作Department表
        factory = new SQLServerFactory();
        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insertDepartment(new Department());
        iDepartment.getDepartmentByName("houqinbu");

    }

}
