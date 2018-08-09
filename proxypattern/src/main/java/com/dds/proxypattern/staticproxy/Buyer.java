package com.dds.proxypattern.staticproxy;

import com.dds.proxypattern.Buyable;

public class Buyer implements Buyable {

    @Override
    public void buy(){
        System.out.println("买房");
    }
}
