package com.lius.adapter;

import com.lius.foreigner.player.ForeignerCenterPlayer;
import com.lius.player.Player;

/**
 * 翻译(适配器)
 * Created by liushuangbo on 2018/7/23.
 */
public class Translator extends Player {

    private ForeignerCenterPlayer fcp = new ForeignerCenterPlayer();

    public Translator(String name) {
        super(name);
        fcp.setName(name);
    }

    @Override
    public void attack() {
        fcp.attackZH();
    }

    @Override
    public void defense() {
        fcp.defenceZH();
    }
}
