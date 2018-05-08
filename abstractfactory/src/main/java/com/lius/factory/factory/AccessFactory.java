package com.lius.factory.factory;

import com.lius.factory.ifactory.IDBFactory;
import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;
import com.lius.factory.product.AccessDepartment;
import com.lius.factory.product.AccessUser;

/**
 * 具体工厂类
 * Access工厂
 * Created by liushuangbo on 2018/5/8.
 */
public class AccessFactory extends IDBFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
