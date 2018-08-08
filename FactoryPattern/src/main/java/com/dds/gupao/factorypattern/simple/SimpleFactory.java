package com.dds.gupao.factorypattern.simple;

import com.dds.gupao.factorypattern.*;

public class SimpleFactory {

    public Mobile create(String name) {
        if ("AppleMobile".equals(name)) {
            return new AppleMobile();
        } else if ("NokiaMobile".equals(name)) {
            return new NokiaMobile();
        } else if ("SamsungMobile".equals(name)) {
            return new SamsungMobile();
        } else if ("WaHwayMobile".equals(name)) {
            return new WaHwayMobile();
        } else {
            return null;
        }
    }

}
