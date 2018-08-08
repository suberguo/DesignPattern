package com.dds.gupao.factorypattern.abstracts;

import com.dds.gupao.factorypattern.Mobile;

public abstract class AbstractFactory {

  public abstract Mobile createAppleMobile();

  public abstract Mobile createNokiaMobile();

  public abstract Mobile createSamsungMobile();

}
