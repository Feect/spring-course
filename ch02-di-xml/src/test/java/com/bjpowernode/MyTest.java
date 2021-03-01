package com.bjpowernode;

import com.bjpowernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest
{

    @Test
    public void test01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容其中获得Student对象
        Student myStudent = (Student) applicationContext.getBean("mystudent");
        System.out.println("Student对象=" + myStudent);
    }



}
