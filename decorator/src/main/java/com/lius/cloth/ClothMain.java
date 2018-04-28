package com.lius.cloth;

/**
 * 只有一个ConcreteComponent时，可以将ConcreteComponent和Component合并
 * 只有一个ConcreteDecorator时，也可以将ConcreteDecorator和Decorator合并
 * Created by liushuangbo on 2018/4/25.
 */
public class ClothMain {
    public static void main(String[] args) {
        Person person = new Person("李明");
        ShirtCloth shirtCloth = new ShirtCloth();
        ShoesCloth shoesCloth = new ShoesCloth();

        shirtCloth.setPerson(person);
        shoesCloth.setPerson(shirtCloth);

        shoesCloth.dress();
    }
}
