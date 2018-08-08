package com.dds.factorypattern.fun;

import com.dds.factorypattern.AppleMobile;
import com.dds.factorypattern.Mobile;

public class AppleFactory implements MobileFactory {

    @Override
    public Mobile create(){
        return new AppleMobile();
    }

}
