package allianz.spring.configuration.centralized;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.context.config.annotation.RefreshScope;

@Profile("configuration-client")
@SpringBootApplication(scanBasePackageClasses = ConfigurationClientApplication.class,
        exclude = {ConfigurationClientApplication.class,
                SecurityAutoConfiguration.class,
                DataSourceAutoConfiguration.class})
public class ConfigurationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class, args);
    }

    //@RefreshScope
    @RestController
    public static class MessageRestController {

        @Value("${message:Hello default}")
        private String message;

        @GetMapping("/message")
        public String getMessage() {
            return this.message;
        }
    }
}
