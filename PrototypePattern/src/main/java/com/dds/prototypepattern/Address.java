package com.dds.prototypepattern;

import java.io.Serializable;

public class Address implements Cloneable,Serializable {
    private String line1;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                '}';
    }
}
