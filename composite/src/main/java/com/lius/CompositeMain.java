package com.lius;

import com.lius.composite.ConcreteCompany;
import com.lius.leaf.FinanceDepartment;
import com.lius.leaf.HRDepartment;

/**
 * 组合模式
 * 组合模式还分为透明方式和安全方式，本例使用的是透明方式
 * 安全方式需要把方法下移到具体的子类中，由子类自定义，这样的话各个类之间所具有的方法就不是透明的了
 * 所有的子类形成一棵树
 * Created by liushuangbo on 2018/8/1.
 */
public class CompositeMain {

    public static void main(String[] args) {
        //创建母公司
        ConcreteCompany root = new ConcreteCompany("北京总公司");

        //创建子公司
        ConcreteCompany shanghaiCompany = new ConcreteCompany("上海分公司");

        //创建总公司的部门
        HRDepartment rootHr = new HRDepartment("北京总公司人力资源部门");
        FinanceDepartment rootFinance = new FinanceDepartment("北京总公司财务部门");

        //将总公司的部门加入到总公司中
        root.add(rootFinance);
        root.add(rootHr);

        //创建分公司部门
        HRDepartment shHRd = new HRDepartment("上海分公司人力资源部门");
        FinanceDepartment shFinance = new FinanceDepartment("上海分公司财务部门");

        //将分公司部门加入到分公司中
        shanghaiCompany.add(shFinance);
        shanghaiCompany.add(shHRd);

        //将分公司加入到总公司中
        root.add(shanghaiCompany);

        //公司结构展示
        System.out.println("组织结构图：");
        root.display(1);
        System.out.println("职责描述：");
        root.lineOfDuty();

    }

}
