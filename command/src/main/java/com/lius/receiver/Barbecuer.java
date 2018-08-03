package com.lius.receiver;

/**
 * 命令执行者
 * 烧烤师傅
 * Created by liushuangbo on 2018/8/3.
 */
public class Barbecuer {

    /**
     * 烤羊肉
     * @param num 数量
     */
    public void bakeMutton(int num) {
        System.out.println("烤" + num + "串羊肉串~~~");
    }

    public void chickenWing(int num) {
        System.out.println("烤" + num + "串鸡翅~~~");
    }

}
