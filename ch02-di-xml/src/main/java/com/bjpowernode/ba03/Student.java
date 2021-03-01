package com.bjpowernode.ba03;

public class Student {

    private String name;
    private int age;

    //声明一个引用类型
    private School school;


    public Student() {
    }
    /*
    创建一个有参构造方法
     */
    public Student(String myName,int myAge,School mySchool){
        System.out.println("=========student()有参数构造方法=========");
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }



    /*
    必须有set方法，没有set方法报错如下信息
    Bean property 'name' is not writable or has an invalid setter method
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
