package com.dds.prototypepattern;

public class DeepClone2 {

    public static void main(String[] args) {
        Consignee consignee = new Consignee();
        consignee.setName("guoshaobo");
        Address add = new Address();
        add.setLine1("深圳");
        consignee.setAddress(add);

        try {
            Consignee cloneObj = (Consignee) consignee.clone();
            System.out.println(consignee.getAddress() == cloneObj.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
