package com.z.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yjizhang on 23/08/2017.
 * 配置类
 *
 * @Configuration 声明当前类是一个配置类
 * @ComponentScan 自动扫描包名下所有使用@Service @Component @Repository @Controller类并注册为Bean
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
