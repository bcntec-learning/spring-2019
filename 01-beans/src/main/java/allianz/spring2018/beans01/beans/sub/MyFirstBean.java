package allianz.spring2018.beans01.beans.sub;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("subMyFirstBean")
public class MyFirstBean implements BeanNameAware  {
    private String myName;


    public void hello() {
        System.err.println("hello sub " + myName + "!!!!!!");
    }


    @Override
    public void setBeanName(String name) {
        this.myName = name;
    }
}
