package com.lius.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Product
 * Created by liushuangbo on 2018/5/3.
 */
public class Product {
    private List<String> computer;

    public Product() {
        this.computer = new ArrayList<>();
    }

    public List<String> getComputer() {
        return computer;
    }

    public void setComputer(List<String> computer) {
        this.computer = computer;
    }

    public void add(String component) {
        this.computer.add(component);
    }

    public void show() throws Exception {
        Iterator<String> iterator = this.computer.iterator();
        System.out.println("计算机开始制造······");
        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            throw new Exception("计算机制造失败······");
        }
        System.out.println("计算机制造完成！");

    }

}
