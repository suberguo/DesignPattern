package com.dds.proxypattern.dynamicproxy.customimpl;

import com.dds.proxypattern.Buyable;
import com.dds.proxypattern.staticproxy.Buyer;

public class CustomProxyImpl {

    public void process() {
        Buyer buyer = new Buyer();
        Buyable buyerProxy = (Buyable) DdsProxy.newProxyInstance(new DdsClassLoader(), new Class<?>[]{Buyable.class}, new CustomInvocationHandler(buyer));
        buyerProxy.buy();

    }

}
