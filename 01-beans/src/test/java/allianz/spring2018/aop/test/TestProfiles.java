package allianz.spring2018.aop.test;


import allianz.spring2018.aop.profiles.FourthBean;
import allianz.spring2018.aop.profiles.MyFourthContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
@ActiveProfiles("bean2")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyFourthContext.class})
public class TestProfiles {


    @Autowired
    FourthBean fourthBean;



    @Test
    public void profile2_asset_not_null(){
        assertNotNull(fourthBean);
        System.err.println(fourthBean);

    }

}
