package allianz.spring2018.aop.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("bean1")
@Component
public class MyFourthBean1 implements FourthBean {
}
