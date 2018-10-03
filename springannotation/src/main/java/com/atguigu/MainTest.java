package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PersistenceDelegate;

public class MainTest {
    public static void main(String[] args) {

//        //通过xml 配置文件的形式获取bean开始
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        Person bean=(Person) applicationContext.getBean("person");
//        System.out.print(bean);
//        //通过xml 配置文件的形式获取bean结束
        //通过注解的方式获取bean开始

        //AnnotationConfigApplicationContext  需要传一个参数，该参数就是配置类. 上面的是传配置文件beans.xml
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.print(bean);
        //通过注解的方式获取bean结束
        System.out.printf("ddd");
    }
}
