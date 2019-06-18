package allianz.spring2018.aop.case2;

import allianz.spring2018.aop.proxy.FirstBean;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MyFirstMain {

    public static void main(String... args){

        //ApplicationContext context = new ClassPathXmlApplicationContext("path/to/applicationContext.xml");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyFirstContext.class);
        ctx.refresh();
        allianz.spring2018.aop.proxy.MyFirstBean c = ctx.getBean(allianz.spring2018.aop.proxy.MyFirstBean.class);
        c.hello();
        allianz.spring2018.aop.proxy.sub.MyFirstBean cSub = ctx.getBean(allianz.spring2018.aop.proxy.sub.MyFirstBean.class);
        cSub.hello();

        Map<String,FirstBean> cIMap = ctx.getBeansOfType(FirstBean.class);
        for (Map.Entry<String,FirstBean> i : cIMap.entrySet()) {
            System.err.print(i.getKey()+"--->>>");
            i.getValue().hello();
        }

        FirstBean z=  BeanFactoryAnnotationUtils.qualifiedBeanOfType(ctx.getBeanFactory(), FirstBean.class, "2");
        z.hello();


        ctx.getBean(Object.class);
        ctx.registerShutdownHook();

    }
}
