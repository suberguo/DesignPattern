package com.dds.gupao.factorypattern.abstracts;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new MobileFactory();
        System.out.println(factory.createAppleMobile());
        System.out.println(factory.createNokiaMobile());
        System.out.println(factory.createSamsungMobile());

    }
}
