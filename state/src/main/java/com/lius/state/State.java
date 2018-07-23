package com.lius.state;

import com.lius.work.Work;

/**
 * 状态
 * Created by liushuangbo on 2018/7/23.
 */
public abstract class State {

    public abstract void handler(Work work);

}
