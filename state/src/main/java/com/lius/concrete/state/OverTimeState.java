package com.lius.concrete.state;

import com.lius.state.State;
import com.lius.work.Work;

/**
 * 加班
 * Created by liushuangbo on 2018/7/23.
 */
public class OverTimeState extends State {
    @Override
    public void handler(Work work) {
        System.out.println("晚上" +work.getHour() + "时，还在加班~~~");
    }
}
