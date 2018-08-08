package com.dds.factorypattern.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        try {
            System.out.println(factory.create("AppleMobile"));
            System.out.println(factory.create("NokiaMobile"));
        }catch (Exception e){

        }


    }
}
