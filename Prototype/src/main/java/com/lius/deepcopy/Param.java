package com.lius.deepcopy;


/**
 * Pojo
 * Created by liushuangbo on 2018/4/27.
 */
public class Param implements Cloneable {

    //面积
    private String area;
    //周长
    private String perimeter;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(String perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
