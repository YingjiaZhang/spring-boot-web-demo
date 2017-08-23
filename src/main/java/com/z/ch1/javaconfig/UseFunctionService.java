package com.z.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yjizhang on 23/08/2017.
 * 使用功能类的 Bean
 */

public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }
    public String useSayHello(String word){
        return functionService.sayHello(word);
    }
}
