package com.z.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yjizhang on 23/08/2017.
 * 使用功能类的 Bean
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String useSayHello(String word){
        return functionService.sayHello(word);
    }
}
