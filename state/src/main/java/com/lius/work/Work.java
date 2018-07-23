package com.lius.work;

import com.lius.concrete.state.ForenoonState;
import com.lius.state.State;

/**
 * 工作
 * Created by liushuangbo on 2018/7/23.
 */
public class Work {

    private int hour;

    private boolean overTime;

    private State currState;

    public Work() {
        currState = new ForenoonState();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isOverTime() {
        return overTime;
    }

    public void setOverTime(boolean overTime) {
        this.overTime = overTime;
    }

    public void setCurrState(State state) {
        currState = state;
    }

    public void handler() {
        currState.handler(this);
    }


}
