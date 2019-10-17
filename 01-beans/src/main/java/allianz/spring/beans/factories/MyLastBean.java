package allianz.spring.beans.factories;

import allianz.spring.beans.FirstBean;
import org.springframework.stereotype.Component;

public class MyLastBean implements FirstBean {
    private  String name;


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String hello() {
        return ("hello " + name + "!!!!!!");
    }
}
