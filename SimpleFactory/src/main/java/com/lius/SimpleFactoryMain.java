package com.lius;

/**
 * Main
 * Created by liushuangbo on 2018/4/25.
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        try {
            Operator add = OperatorFactory.createFactory("+");
            add.setNumA(5);
            add.setNumB(2);
            int res = add.operator();
            System.out.println(res);

            Operator muis = OperatorFactory.createFactory("-");
            muis.setNumA(5);
            muis.setNumB(2);
            res = muis.operator();
            System.out.println(res);

            Operator unDefin = OperatorFactory.createFactory("AB");
            unDefin.setNumA(5);
            unDefin.setNumB(2);
            res = unDefin.operator();
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
