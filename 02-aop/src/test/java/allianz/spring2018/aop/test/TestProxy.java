package allianz.spring2018.aop.test;


import allianz.spring2018.aop.proxy.FirstBean;
import allianz.spring2018.aop.proxy.MyFirstBean;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static org.junit.Assert.assertNotNull;

public class TestProxy {
    FirstBean myFirstBean;

    final FirstBean target = new MyFirstBean();


    @Before
    public void init(){

        InvocationHandler handler = new  InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.err.println("alooooo");
                return method.invoke(target, args);
            }
        };


        myFirstBean = (FirstBean) Proxy.newProxyInstance(
                FirstBean.class.getClassLoader(), new Class[] { FirstBean.class }, handler);


    }


    @Test
    public void target_asset_not_null() {
        assertNotNull(target);
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        target.hello("target_asset_not_null");
        System.err.println(target);

    }

    @Test
    public void proxy_asset_not_null() {
        assertNotNull(myFirstBean);
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        myFirstBean.hello("proxy_asset_not_null");
        System.err.println(myFirstBean);

    }



}
