package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest
{

    @Test
    public void test01()
    {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) applicationContext.getBean("someService");
        service.doSome();
    }
}
