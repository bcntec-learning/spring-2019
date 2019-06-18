package allianz.spring2018.aop.case1;

import allianz.spring2018.aop.proxy.MyFirstBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstMain2 {

    public static void main(String... args){

        //ApplicationContext context = new ClassPathXmlApplicationContext("path/to/applicationContext.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyFirstContext2.class);
        ctx.refresh();
        MyFirstBean c = ctx.getBean(MyFirstBean.class);
        c.hello();
        ctx.registerShutdownHook();

    }
}