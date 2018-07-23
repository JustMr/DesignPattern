package com.lius.concrete.player;

import com.lius.player.Player;

/**
 * 前锋
 * Created by liushuangbo on 2018/7/23.
 */
public class ForwardsPlayer extends Player {

    public ForwardsPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Forwards player " + name + " attack ");
    }

    @Override
    public void defense() {
        System.out.println("Forwards player " + name + " defense ");
    }
}
