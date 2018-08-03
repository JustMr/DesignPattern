package com.lius.handler;

/**
 * Handler
 * Created by liushuangbo on 2018/8/3.
 */
public abstract class Manager {

    protected Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public abstract void handlerRequest(int request);

}
