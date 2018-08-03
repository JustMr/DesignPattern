package com.lius.concreteMediator;

import com.lius.colleague.Country;
import com.lius.concreteColleage.Canada;
import com.lius.concreteColleage.China;
import com.lius.mediator.UnitedNations;

/**
 * 具体中介类
 * 联合国安理会
 * Created by liushuangbo on 2018/8/3.
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private China country1;
    private Canada country2;

    public China getCountry1() {
        return country1;
    }

    public void setCountry1(China country1) {
        this.country1 = country1;
    }

    public Canada getCountry2() {
        return country2;
    }

    public void setCountry2(Canada country2) {
        this.country2 = country2;
    }

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == country1) {
            country2.getMessage(message);
        } else if (colleague == country2) {
            country1.getMessage(message);
        }
    }
}
