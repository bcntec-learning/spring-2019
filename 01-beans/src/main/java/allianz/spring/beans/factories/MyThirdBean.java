package allianz.spring.beans.factories;

import allianz.spring.beans.FirstBean;

public class MyThirdBean implements FirstBean {
    private final String name;

    public MyThirdBean(String name) {
        this.name = name;
    }


    @Override
    public String hello() {
        return ("hello " + name + "!!!!!!");
    }
}
