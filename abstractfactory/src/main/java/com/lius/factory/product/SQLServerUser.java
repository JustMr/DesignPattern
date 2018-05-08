package com.lius.factory.product;

import com.lius.factory.entity.User;
import com.lius.factory.iproduct.IUser;

/**
 * 具体产品类
 * 通过SQL Server操作User表
 * Created by liushuangbo on 2018/5/8.
 */
public class SQLServerUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("使用SQL Server插入一条User记录");
    }

    @Override
    public User getUserByName(String name) {
        System.out.println("使用SQL Server通过name查询到一条User记录");
        return null;
    }
}
