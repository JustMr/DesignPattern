package com.lius.factory.ifactory;

import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;

/**
 * 抽象工厂类
 * Created by liushuangbo on 2018/5/8.
 */
public abstract class IDBFactory {

    public abstract IUser createUser();

    public abstract IDepartment createDepartment();

}
