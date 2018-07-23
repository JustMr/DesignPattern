package com.lius.foreigner.player;

/**
 * 外籍中锋
 * Created by liushuangbo on 2018/7/23.
 */
public class ForeignerCenterPlayer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackZH() {
        System.out.println("中锋球员 " + name + " 进攻");
    }

    public void defenceZH() {
        System.out.println("中锋球员 " + name + " 防守");
    }

}
