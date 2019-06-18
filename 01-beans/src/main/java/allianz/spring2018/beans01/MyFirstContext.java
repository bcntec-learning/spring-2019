package allianz.spring2018.beans01;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ClassUtils;

@Configuration
@ComponentScan(value = "allianz.spring2018.beans01",nameGenerator = MyFirstContext.MyBeanNameGenerator.class)
public class MyFirstContext {

    static class MyBeanNameGenerator implements BeanNameGenerator {

        @Override
        public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
            return ClassUtils.getShortName(definition.getBeanClassName())+"!plus";
        }
    }
}
