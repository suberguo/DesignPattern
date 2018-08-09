package com.dds.proxypattern.dynamicproxy.jdkimpl;

import com.dds.proxypattern.staticproxy.Buyer;

public class JDKDynamicProxyTest {
    public static void main(String[] args) {
        JDKProxyImpl proxyImpl = new JDKProxyImpl();
        proxyImpl.process(new Buyer());
    }
}
