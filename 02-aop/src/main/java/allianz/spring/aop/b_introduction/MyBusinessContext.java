package allianz.spring.aop.b_introduction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class MyBusinessContext {
    @Bean
    public MyBusiness1 myBusiness1() {
        return new MyBusiness1();
    }

    @Bean
    public MyBusiness2 myBusiness2() {
        return new MyBusiness2();
    }

    @Bean
    public MyAuditAspect myAuditAspect() {
        return new MyAuditAspect();
    }

    @Bean
    public List<String> getTrace() {
        return new ArrayList<>();
    }
}
