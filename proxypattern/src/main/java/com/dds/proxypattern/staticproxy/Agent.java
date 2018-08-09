package com.dds.proxypattern.staticproxy;

import com.dds.proxypattern.Buyable;

public class Agent implements Buyable {
   private Buyer buyer;

    public Agent(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public void buy(){
        this.buyer.buy();
    }
}
