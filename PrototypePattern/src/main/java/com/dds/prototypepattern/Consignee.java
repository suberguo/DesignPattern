package com.dds.gupao.prototypepattern;

import java.io.Serializable;

public class Consignee implements Cloneable,Serializable {

    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Consignee con =(Consignee) super.clone();
        con.setAddress((Address) con.address.clone());
        return con;
    }

    @Override
    public String toString() {
        return "Consignee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
