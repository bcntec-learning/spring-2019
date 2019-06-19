package allianz.spring.beans.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "allianz.spring.beans.factories")
public class MyFactoryContext {

    @Bean  //@Producer
    public MyThirdBean myThirdBean(MyFirstBean sub){
        //if()
        return new MyThirdBean(sub.getMyName());
    }

}
