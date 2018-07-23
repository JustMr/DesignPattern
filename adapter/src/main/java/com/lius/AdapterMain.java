package com.lius;

import com.lius.adapter.Translator;
import com.lius.concrete.player.CenterPlayer;
import com.lius.concrete.player.ForwardsPlayer;
import com.lius.player.Player;

/**
 * 适配器模式
 * Created by liushuangbo on 2018/7/23.
 */
public class AdapterMain {

    public static void main(String[] args) {
        Player center = new CenterPlayer("James");
        center.attack();
        Player forwards = new ForwardsPlayer("Kobe");
        forwards.attack();
        Player translator = new Translator("姚明");
        translator.attack();
    }

}
