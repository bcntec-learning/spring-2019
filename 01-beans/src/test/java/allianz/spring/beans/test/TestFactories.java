package allianz.spring.beans.test;


import allianz.spring.beans.factories.MyThirdBean;
import allianz.spring.beans.factories.MyFactoryContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyFactoryContext.class})
public class TestFactories {


    @Autowired
    MyThirdBean bean3;



    @Test
    public void factory_not_null(){
        assertNotNull(bean3);
        assertEquals("hello myFirstBean!!!!!!",bean3.hello());
    }

}
