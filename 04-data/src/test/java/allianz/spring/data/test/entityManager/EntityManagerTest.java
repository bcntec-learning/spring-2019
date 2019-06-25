package allianz.spring.data.test.entityManager;

import allianz.spring.data.entities.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class EntityManagerTest {


    @Test
    public void standalone() {
        Map<String, String> map = new HashMap<>();
        map.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        map.put("hibernate.hbm2ddl.auto", "create");
        map.put("hibernate.show", "true");
        map.put("javax.persistence.jdbc.url","jdbc:hsqldb:mem:jpa21:persistence-unit");
/*
https://thoughts-on-java.org/standardized-schema-generation-data-loading-jpa-2-1/
javax.persistence.schema-generation.database.action : for database action, values are "none", "create", "drop-and-create", "drop".
javax.persistence.schema-generation.scripts.action : for DDL scripts, values are "none", "create", "drop-and-create", "drop".
javax.persistence.schema-generation.scripts.create-target : name of the create table script
javax.persistence.schema-generation.scripts.drop-target : name of the drop table script
javax.persistence.sql-load-script-source
 */


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa21:persistence-unit",map);
        EntityManager entityManager = factory.createEntityManager();


        for (UserEntity user : entityManager.createQuery("from User u order by u.name", UserEntity.class).getResultList()) {
            log.info(user.getName());
        }

        UserEntity  juan = entityManager.find(UserEntity.class,1L);

        System.out.println(juan);

    }

}
