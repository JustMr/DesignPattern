package com.lius.concrete.state;

import com.lius.state.State;
import com.lius.work.Work;

/**
 * 上午工作状态
 * Created by liushuangbo on 2018/7/23.
 */
public class ForenoonState extends State {

    @Override
    public void handler(Work work) {
        if (work.getHour() < 12) {
            System.out.println("上午"+ work.getHour() + "时，状态满满~~~");
        } else {
            work.setCurrState(new NoonState());
            work.handler();;
        }
    }
}
