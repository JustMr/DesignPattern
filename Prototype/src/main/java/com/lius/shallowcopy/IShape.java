package com.lius.shallowcopy;

/**
 * Prototype
 * Created by liushuangbo on 2018/4/27.
 */
public abstract class IShape implements Cloneable {

    private String id;
    protected String type;
    protected Param param;

    public IShape() {
        param = new Param();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void drew() {
        System.out.println("面积为:" + param.getArea() + ";周长为:" + param.getPerimeter());
    }

    public void setParam(String area, String perimeter) {
        this.param.setArea(area);
        this.param.setPerimeter(perimeter);
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
