package com.lius.player;

/**
 *
 * Created by liushuangbo on 2018/7/23.
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}
