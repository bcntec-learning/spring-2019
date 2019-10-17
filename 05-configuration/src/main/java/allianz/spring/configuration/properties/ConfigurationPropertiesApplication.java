package allianz.spring.configuration.properties;

import allianz.spring.configuration.centralized.ConfigurationServiceApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = ConfigurationPropertiesApplication.class)
public class ConfigurationPropertiesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        //SpringApplication application = new SpringApplication(ConfigurationServiceApplication.class);
        SpringApplication.run(ConfigurationServiceApplication.class ,args);


    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("tengo el control");
    }
}
