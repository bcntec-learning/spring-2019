package allianz.spring.configuration.centralized;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.config.server.EnableConfigServer;

@Profile("configuration-service")
@EnableWebMvc
//@EnableConfigServer
@SpringBootApplication(scanBasePackageClasses = ConfigurationServiceApplication.class,
        exclude = {ConfigurationClientApplication.class, SecurityAutoConfiguration.class,
                DataSourceAutoConfiguration.class})
public class ConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServiceApplication.class, args);
    }
}