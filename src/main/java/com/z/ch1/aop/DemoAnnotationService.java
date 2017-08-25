package com.z.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by yjizhang on 25/08/2017.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
