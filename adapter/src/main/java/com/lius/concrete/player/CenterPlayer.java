package com.lius.concrete.player;

import com.lius.player.Player;

/**
 * 中锋
 * Created by liushuangbo on 2018/7/23.
 */
public class CenterPlayer extends Player {

    public CenterPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center palyer " + name+" attack ");
    }

    @Override
    public void defense() {
        System.out.println("Center palyer " + name+" defense ");
    }
}
