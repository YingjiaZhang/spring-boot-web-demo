package com.z.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by yjizhang on 25/08/2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
