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


    /**
     * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中的所有对象
     */
    @Test
    public void test02(){
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象，你要调用对象的方法
        //getBean("配置文件中的bean的id值")
        SomeService service = (SomeService) applicationContext.getBean("someService");
        service.doSome();
    }


    /**
     * 获取spring容器中java对象的数量
     */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = applicationContext.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量位：" + nums);

        //容器中每个定义的对象的名称
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
