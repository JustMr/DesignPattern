package com.lius;

import com.lius.colleague.Country;
import com.lius.concreteColleage.Canada;
import com.lius.concreteColleage.China;
import com.lius.concreteMediator.UnitedNationsSecurityCouncil;
import com.lius.mediator.UnitedNations;

/**
 * 中介者模式
 * Created by liushuangbo on 2018/8/3.
 */
public class MediatorMain {
    public static void main(String[] args) {
        //创建联合国
        UnitedNationsSecurityCouncil un = new UnitedNationsSecurityCouncil();
        //创建国家
        China china  = new China(un, "大力发展经济，加入亚投行组织");
        Canada canada = new Canada(un,"我加拿大从来是世界事务中打酱油");

        //国家加入联合国
        un.setCountry1(china);
        un.setCountry2(canada);

        china.sendMessage();
        canada.sendMessage();
    }
}
