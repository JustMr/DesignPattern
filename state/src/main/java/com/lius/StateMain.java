package com.lius;

import com.lius.work.Work;

/**
 * 状态模式，通过将判断逻辑分离，将处理分解到不同的类中，进而简化判断
 * Created by liushuangbo on 2018/7/23.
 */
public class StateMain {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(22);
        work.setOverTime(true);
        work.handler();
    }

}
