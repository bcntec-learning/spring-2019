package allianz.spring2018.aop.test;


import allianz.spring2018.aop.proxy.FirstBean;
import allianz.spring2018.aop.proxy.MyFirstBean;
import allianz.spring2018.aop.proxy.MySecondBean;
import allianz.spring2018.aop.case2.MyFirstContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyFirstContext.class})
public class TestCases {

    @Autowired
    MyFirstBean myFirstBean;

    @Qualifier("2")
    @Autowired
    FirstBean bean2;


    @Autowired
    MySecondBean b;


    @Test
    public void first_asset_not_null(){
        assertNotNull(myFirstBean);
        myFirstBean.hello();

    }

    @Test
    public void first_qualified_asset_not_null(){
        assertNotNull(bean2);
        bean2.hello();

    }

    @Test
    public void second_asset_not_null(){
        assertNotNull(b);
        b.hello();

    }
}
