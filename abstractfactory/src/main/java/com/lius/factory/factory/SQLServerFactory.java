package com.lius.factory.factory;

import com.lius.factory.ifactory.IDBFactory;
import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;
import com.lius.factory.product.SQLServerDepartment;
import com.lius.factory.product.SQLServerUser;

/**
 * 具体工厂类
 * SQL Server工厂
 * Created by liushuangbo on 2018/5/8.
 */
public class SQLServerFactory extends IDBFactory {
    @Override
    public IUser createUser() {
        return new SQLServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SQLServerDepartment();
    }
}
