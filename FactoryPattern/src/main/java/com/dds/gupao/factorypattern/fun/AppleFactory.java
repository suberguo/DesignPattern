package com.dds.gupao.factorypattern.fun;

import com.dds.gupao.factorypattern.AppleMobile;
import com.dds.gupao.factorypattern.Mobile;

public class AppleFactory implements MobileFactory {

    @Override
    public Mobile create(){
        return new AppleMobile();
    }

}
