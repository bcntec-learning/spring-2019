package allianz.spring2018.beans01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstMain {

    public static void main(String... args){

        //ApplicationContext context = new ClassPathXmlApplicationContext("path/to/applicationContext.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyFirstContext.class);
        ctx.refresh();
        MyFirstBean c = ctx.getBean(MyFirstBean.class);
        c.hello();

    }
}
