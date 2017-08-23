package com.z.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by yjizhang on 23/08/2017.
 * 编写功能类的 Bean
 */

@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
