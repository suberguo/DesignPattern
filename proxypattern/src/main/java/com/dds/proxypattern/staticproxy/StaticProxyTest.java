package com.dds.proxypattern.staticproxy;

import com.dds.proxypattern.Buyable;

public class StaticProxyTest {
    public static void main(String[] args) {
        Buyable agent = new Agent(new Buyer());
        agent.buy();

    }
}
