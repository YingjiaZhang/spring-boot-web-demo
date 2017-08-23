package com.z.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yjizhang on 23/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        // 使用 AnnotationConfigApplicationContext 作为 Spring 容器 ，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.useSayHello("javaConfig"));
        context.close();
    }

}
