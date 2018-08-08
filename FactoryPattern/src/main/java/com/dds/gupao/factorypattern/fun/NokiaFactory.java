package com.dds.gupao.factorypattern.fun;

import com.dds.gupao.factorypattern.Mobile;
import com.dds.gupao.factorypattern.NokiaMobile;

public class NokiaFactory implements MobileFactory {

    @Override
    public Mobile create(){
        return new NokiaMobile();
    }

}
