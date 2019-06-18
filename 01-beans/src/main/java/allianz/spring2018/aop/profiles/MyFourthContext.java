package allianz.spring2018.aop.profiles;

import org.springframework.context.annotation.*;

//@Profile("!bean2")
@Configuration
@ComponentScan(value = "allianz.spring2018.aop.profiles")
//@Import(MyProdContext.class, MyDesaContext.class)
public class MyFourthContext {


}
