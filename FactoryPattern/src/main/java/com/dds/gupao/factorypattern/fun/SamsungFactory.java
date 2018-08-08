package com.dds.gupao.factorypattern.fun;

import com.dds.gupao.factorypattern.Mobile;
import com.dds.gupao.factorypattern.SamsungMobile;

public class SamsungFactory implements MobileFactory{
    @Override
    public Mobile create(){
        return new SamsungMobile();
    }
}
