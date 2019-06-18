package allianz.spring2018.aop.proxy.sub;

import allianz.spring2018.aop.proxy.FirstBean;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Qualifier("2")
@Component
public class MyFirstBean2 implements FirstBean, BeanNameAware {
    private String myName;

    @Override
    public void hello() {
        System.err.println("hello sub2 " + myName + "!!!!!!");
    }


    @Override
    public void setBeanName(String name) {
        this.myName = name;
    }


    @PostConstruct
    public void p0() {
        System.err.println("constructed " + myName);
    }

    @PreDestroy
    public void p1() {
        System.err.println("destroying " + myName);
    }
}
