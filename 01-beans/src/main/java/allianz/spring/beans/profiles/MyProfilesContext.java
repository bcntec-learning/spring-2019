package allianz.spring.beans.profiles;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Profile("!bean2")
@Configuration
@ComponentScan(value = "allianz.spring.beans.profiles")
//@Import(MyProdContext.class, MyDesaContext.class)
public class MyProfilesContext {


}
