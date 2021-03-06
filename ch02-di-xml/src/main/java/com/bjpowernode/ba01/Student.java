package com.bjpowernode.ba01;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("spring会调用类的无参数构造方法创建对象");
    }

    /*
    必须有set方法，没有set方法报错如下信息
    Bean property 'name' is not writable or has an invalid setter method
     */

    public void setName(String name) {
        System.out.println("setName=" + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge=" + age);
        this.age = age;
    }

    public void setEmail(String email){
        System.out.println("email=" + email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
