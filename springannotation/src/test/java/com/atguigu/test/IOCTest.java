package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames= applicationContext.getBeanDefinitionNames(); //获取容器中所有bean定义的name的名字
        for (String name:definitionNames
             ) {

            System.out.println(name);
        }
    }
}
