package allianz.spring.configuration.profiles;

import allianz.spring.configuration.centralized.ConfigurationServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = ProfilesDevMain.class )
public class ProfilesDevMain {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConfigurationServiceApplication.class);
        application.setAdditionalProfiles("dev");
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
