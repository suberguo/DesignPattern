package com.dds.gupao.prototypepattern;

import java.io.*;

public class DeepClone {
    public static void main(String[] args) throws Exception{

        Consignee consignee = new Consignee();
        consignee.setName("guoshaobo");
        Address add = new Address();
        add.setLine1("深圳");
        consignee.setAddress(add);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(consignee);


        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream instream = new ObjectInputStream(inputStream);
        Consignee consignee1 = (Consignee)instream.readObject();
        System.out.println(consignee1);
        System.out.println(consignee);
        System.out.println(consignee==consignee1);

    }
}
