package com.lius.reflect.factory;

import com.lius.factory.iproduct.IDepartment;
import com.lius.factory.iproduct.IUser;

/**
 * 静态工厂类
 * 利用反射加载不同的产品对象,去掉case或if判断
 * Created by liushuangbo on 2018/5/8.
 */
public class DataAccess {

    private static String db = "SQLServer";
//    private static String db = "Access";

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.lius.factory.product." + db + "User";
        Class<IUser> userData = (Class<IUser>) Class.forName(className);
        return userData.newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.lius.factory.product." + db + "Department";
        Class<IDepartment> departmentClass = (Class<IDepartment>) Class.forName(className);
        return departmentClass.newInstance();
    }

}
