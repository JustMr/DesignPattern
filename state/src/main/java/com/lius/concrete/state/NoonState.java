package com.lius.concrete.state;

import com.lius.state.State;
import com.lius.work.Work;

/**
 * 中午
 * Created by liushuangbo on 2018/7/23.
 */
public class NoonState extends State {

    @Override
    public void handler(Work work) {
        if (work.getHour() <14) {
            System.out.println("中午" + work.getHour() + "时，需要午休~~~");
        } else {
            work.setCurrState(new AfternoonState());
            work.handler();
        }
    }
}
