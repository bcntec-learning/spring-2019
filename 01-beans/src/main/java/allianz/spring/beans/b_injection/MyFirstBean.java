package allianz.spring.beans.b_injection;


import allianz.spring.beans.FirstBean;
import org.springframework.stereotype.Component;


@Component
public class MyFirstBean implements FirstBean {


    @Override
    public String hello() {
        return  "hello  !!!!!!";
    }


}
