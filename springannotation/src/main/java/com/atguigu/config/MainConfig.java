package com.atguigu.config;


import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


//配置类，等同于bean.xml这种配置文件的形式
@Configuration //告诉Spring，这是一个配置类
//@ComponentScan(value = "com.atguigu", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class, Controller.class})})
@ComponentScan(value = "com.atguigu", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = { Controller.class})},useDefaultFilters = false)
//@ComponentScan value：表示指定要扫描的包
//excludeFilters=Filter[]
//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class,Controller.class}) 表示加了Service,Control
//的组件，都不会加载进来
public class MainConfig {
    // 这个注解跟xml配置文件中的<bean></bean>标签的作用是一样的。它的作用就是给容器注册一个bean。
    // bean的类型为返回值的类型，id 默认是用方法名作为id
    //@Bean("person")，person 表示这个bean的id 是person
    @Bean("person")
    public Person person() {
        return new Person("lisi", 20); //表示使用 Persion 这个类中的有参构造器
    }
}
