package allianz.spring2018.aop.factories;

import allianz.spring2018.aop.proxy.MyThirdBean;
import allianz.spring2018.aop.proxy.sub.MyFirstBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "allianz.spring2018.aop.proxy")
public class MyFactoryContext {

    @Bean  //@Producer
    public MyThirdBean myThirdBean(MyFirstBean sub){
        //if()
        return new MyThirdBean(sub.getMyName());
    }

}
