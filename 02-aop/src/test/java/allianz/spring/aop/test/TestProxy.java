package allianz.spring.aop.test;


import allianz.spring.aop.a_proxy.FirstBean;
import allianz.spring.aop.a_proxy.MyFirstBean;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TestProxy {
    FirstBean myFirstBean;

    FirstBean target = new MyFirstBean();


    @Before
    public void init() {

        InvocationHandler handler = new InvocationHandler() {
            int i = 0;

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (i > 3) {
                    throw new RuntimeException("no no no");
                }
                i++;
                return method.invoke(target, args);
            }
        };


        myFirstBean = (FirstBean) Proxy.newProxyInstance(
                FirstBean.class.getClassLoader(), new Class[]{FirstBean.class}, handler);


    }


    @Test
    public void target_asset_not_null() {
        assertNotNull(target);
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        //System.err.println(target); //== System.err.println(target.toString());

    }


    @Test(expected = RuntimeException.class)
    public void proxy_asset_fail() {
        assertNotNull(myFirstBean);
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        fail();

    }


    @Test
    public void proxy_asset_ok() {
        assertNotNull(myFirstBean);
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");


    }


}
