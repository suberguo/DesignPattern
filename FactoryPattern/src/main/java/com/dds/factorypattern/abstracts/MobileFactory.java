package com.dds.factorypattern.abstracts;

import com.dds.factorypattern.AppleMobile;
import com.dds.factorypattern.Mobile;
import com.dds.factorypattern.NokiaMobile;
import com.dds.factorypattern.SamsungMobile;

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
