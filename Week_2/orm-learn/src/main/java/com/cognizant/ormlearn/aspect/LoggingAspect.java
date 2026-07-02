package com.cognizant.ormlearn.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.cognizant.ormlearn.service.*.*(..))")
    public void before() {
        System.out.println("Start");
    }

    @After("execution(* com.cognizant.ormlearn.service.*.*(..))")
    public void after() {
        System.out.println("End");
    }
}