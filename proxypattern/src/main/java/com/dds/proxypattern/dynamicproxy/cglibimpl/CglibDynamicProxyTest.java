package com.dds.proxypattern.dynamicproxy.cglibimpl;

import com.dds.proxypattern.staticproxy.Buyer;
import net.sf.cglib.proxy.Enhancer;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class CglibDynamicProxyTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Buyer.class);
        enhancer.setCallback(new CglibProxyImpl());
        Buyer buyerProxy =(Buyer) enhancer.create();
        buyerProxy.buy();

        System.out.println(buyerProxy);
        System.out.println("test");

        byte[] bytes = ProxyGenerator.generateProxyClass("cglibproxy.class",new Class<?>[]{buyerProxy.getClass()});
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\idea-workspace\\cglibproxy.class");
            outputStream.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
