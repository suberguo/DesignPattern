package com.dds.factorypattern.abstracts;

import com.dds.factorypattern.Mobile;

public abstract class AbstractFactory {

  public abstract Mobile createAppleMobile();

  public abstract Mobile createNokiaMobile();

  public abstract Mobile createSamsungMobile();

}
