package com.lius.concrete.state;

import com.lius.state.State;
import com.lius.work.Work;

/**
 * 下午
 * Created by liushuangbo on 2018/7/23.
 */
public class AfternoonState extends State {

    @Override
    public void handler(Work work) {
        if (work.getHour() <18) {
            System.out.println("下午" + work.getHour() + "时，睡的太少，一直困");
        } else {
            if (work.isOverTime()) {
                //加班
                work.setCurrState(new OverTimeState());
            } else {
                //回家
                work.setCurrState(new HomeState());
            }
            work.handler();
        }
    }
}
