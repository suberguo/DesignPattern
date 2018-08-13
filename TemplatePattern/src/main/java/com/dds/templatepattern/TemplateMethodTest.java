package com.dds.templatepattern;

public class TemplateMethodTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao(null);
        userDao.list();
    }
}
