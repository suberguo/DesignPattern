package com.dds.factorypattern.fun;

public class FactoryMethodTest {
    public static void main(String[] args) {
        MobileFactory factory = new AppleFactory();
        System.out.println(factory.create());
    }
}
