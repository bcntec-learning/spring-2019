package allianz.spring2018.beans01;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;


@Component
public class MyFirstBean implements BeanNameAware , BeanPostProcessor {
    private String myName;


    public void hello(){
        System.err.println("hello " + myName + "!!!!!!");
    }


    @Override
    public void setBeanName(String name) {
        this.myName=name;
    }

    /* see MyFirstAOPBean
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Serializable){
        return bean;
        }
        throw new BeanCreationException("no eres serializable");
    }
     */

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @PostConstruct
    public void p0(){
        System.err.println("constructed "+myName);
    }

    @PreDestroy
    public void p1(){
        System.err.println("destroying "+myName);
    }
}
