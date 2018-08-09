package com.dds.proxypattern.dynamicproxy.jdkimpl;

import com.dds.proxypattern.Buyable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BuyerInvocationHandler implements InvocationHandler {
    private Buyable buyer;

    public BuyerInvocationHandler(Buyable buyer) {
        this.buyer = buyer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.buyer,args);
    }
}
