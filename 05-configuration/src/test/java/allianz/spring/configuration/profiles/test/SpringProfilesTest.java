package allianz.spring.configuration.profiles.test;

import allianz.spring.configuration.profiles.DatasourceConfig;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringProfilesTest {
    @Autowired
    DatasourceConfig datasourceConfig;
 
    public void setupDatasource() {
        datasourceConfig.setup();
    }
}