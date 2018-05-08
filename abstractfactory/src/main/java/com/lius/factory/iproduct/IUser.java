package com.lius.factory.iproduct;

import com.lius.factory.entity.User;

/**
 * 抽象产品类
 * Created by liushuangbo on 2018/5/8.
 */
public interface IUser {

    void insertUser(User user);

    User getUserByName(String name);

}
