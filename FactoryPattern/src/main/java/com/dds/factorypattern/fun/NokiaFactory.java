package com.dds.factorypattern.fun;

import com.dds.factorypattern.Mobile;
import com.dds.factorypattern.NokiaMobile;

public class NokiaFactory implements MobileFactory {

    @Override
    public Mobile create(){
        return new NokiaMobile();
    }

}
