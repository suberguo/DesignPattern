package com.dds.gupao.factorypattern.abstracts;

import com.dds.gupao.factorypattern.AppleMobile;
import com.dds.gupao.factorypattern.Mobile;
import com.dds.gupao.factorypattern.NokiaMobile;
import com.dds.gupao.factorypattern.SamsungMobile;

public class MobileFactory extends AbstractFactory {

    @Override
    public Mobile createAppleMobile() {
        return new AppleMobile();
    }

    @Override
    public Mobile createNokiaMobile() {
        return new NokiaMobile();
    }

    @Override
    public Mobile createSamsungMobile() {
        return new SamsungMobile();
    }

}
