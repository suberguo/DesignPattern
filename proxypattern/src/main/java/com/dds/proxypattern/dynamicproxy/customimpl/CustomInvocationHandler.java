package com.dds.proxypattern.dynamicproxy.customimpl;

import com.dds.proxypattern.Buyable;

import java.lang.reflect.Method;

public class CustomInvocationHandler implements DdsInvocationHandler {

    private Buyable b;

    public CustomInvocationHandler(Buyable b) {
        this.b = b;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.b, args);
    }
}
