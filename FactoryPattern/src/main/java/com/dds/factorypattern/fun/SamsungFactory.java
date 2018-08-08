package com.dds.factorypattern.fun;

import com.dds.factorypattern.SamsungMobile;
import com.dds.factorypattern.Mobile;

public class SamsungFactory implements MobileFactory{
    @Override
    public Mobile create(){
        return new SamsungMobile();
    }
}
