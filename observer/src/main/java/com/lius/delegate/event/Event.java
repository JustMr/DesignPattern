package com.lius.delegate.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 事件类
 * Created by liushuangbo on 2018/5/7.
 */
public class Event {

    //要执行方法的对象
    private Object object;
    //要执行方法的对象名
    private String methodName;
    //要执行方法的参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramTypes;

    public Event(Object object, String method, Object... args) {
        this.object = object;
        this.methodName = method;
        this.params = args;
        concreteParamTypes(this.params);
    }

    private void concreteParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //判断是否有该方法
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        if (null == method) {
            return;
        }
        //利用发射机制调用函数
        method.invoke(this.object, this.params);
    }

}
