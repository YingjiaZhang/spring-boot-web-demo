package com.z.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yjizhang on 25/08/2017.
 */
@Configuration
@ComponentScan("com.z.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
