package com.lius.composite;

import com.lius.component.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司名称
 * Created by liushuangbo on 2018/8/1.
 */
public class ConcreteCompany extends Company {

    //子节点集合
    private List<Company> companies = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        companies.add(c);
    }

    @Override
    public void remove(Company c) {
        for (Company company: companies) {
            if (company.getName().equals(c.getName())) {
                companies.remove(company);
                break;
            }
        }
    }

    @Override
    public void display(int depth) {
        for (int i=0; i<depth;i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (Company company: companies) {
            company.display(depth+1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company: companies) {
            company.lineOfDuty();
        }
    }
}
