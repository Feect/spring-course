### IoC的技术实现

> 1. Di是ioc的技术实现
> 2. DI(Dependency Injection)：依赖注入，只需要在程序中提供要使用的对象名称就可以，至于对象如何在容器中创建、赋值、查找都由容器内部实现



spring是使用的di实现了ioc的功能，spring底层创建对象，使用的是反射机制

spring是一个容器，管理对象、给属性赋值，底层是反射创建对象



spring-context和spring-webmvc是spring中的两个模块

spring-context：是ioc功能创建对象的

spring-webmvc做web开发使用的，是servlet的升级

spring-webmvc中也会用到spring-context中创建对象的功能



### Junit

> 单元测试，是一个工具类库，做测试方法是用的
> 
> 单元：制定的是方法，一个类中有很多方法，一个方法称为单元



**使用单元测试**

1. 需要加入junit依赖

   ```xml
   <!--单元测试-->
       <dependency>
         <groupId>junit</groupId>
         <artifactId>junit</artifactId>
         <version>4.11</version>
         <scope>test</scope>
       </dependency>
   ```



2. 创建测试类
>src/test/java	目录中创建类



3. 创建测试方法

    1. public方法
    2. 没有返回值void
    3. 方法名称自定义（建议：test + 你要测试方法名称）
    4. 方法没有参数
    5. 方法的上面加入 @Test，这样的方法是可以单独执行的。不用使用main方法































