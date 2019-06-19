package allianz.spring.beans.a_naming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomNamingBeanMain {

    public static void main(String... args){

        //ApplicationContext context = new ClassPathXmlApplicationContext("path/to/applicationContext.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CustomNamingBeanContext.class);
        ctx.refresh();
        MyFirstBean c = ctx.getBean(MyFirstBean.class);
        System.err.println(c.hello());
        ctx.registerShutdownHook();

    }
}
