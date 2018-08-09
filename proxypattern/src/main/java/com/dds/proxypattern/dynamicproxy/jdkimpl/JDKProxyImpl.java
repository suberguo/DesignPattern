package com.dds.proxypattern.dynamicproxy.jdkimpl;

import com.dds.proxypattern.Buyable;

import java.lang.reflect.Proxy;

public class JDKProxyImpl {

    public void process(Buyable buyer)
    {
        Class<?> clz = buyer.getClass();
        Buyable buyerProxy = (Buyable)Proxy.newProxyInstance(clz.getClassLoader(),
                clz.getInterfaces(),
                new BuyerInvocationHandler(buyer));
        buyerProxy.buy();

        /*
        byte[] bytes = ProxyGenerator.generateProxyClass("proxy12.class",new Class<?>[]{buyerProxy.getClass()});
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\idea-workspace\\proxy12.class");
            outputStream.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }

}
