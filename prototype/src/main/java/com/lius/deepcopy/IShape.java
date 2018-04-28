package com.lius.deepcopy;


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

    /**
     * 克隆时把被引用的对象也克隆一次便完成了深复制
     * @return 深克隆后对象
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        IShape clone = (IShape) super.clone();
        clone.param = (Param) this.param.clone();

        return clone;
    }

}
