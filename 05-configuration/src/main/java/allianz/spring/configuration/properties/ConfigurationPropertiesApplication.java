package allianz.spring.configuration.properties;

import allianz.spring.configuration.centralized.ConfigurationServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = ConfigurationPropertiesApplication.class )
public class ConfigurationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConfigurationServiceApplication.class);
        application.setAdditionalProfiles("dev");
        //application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
