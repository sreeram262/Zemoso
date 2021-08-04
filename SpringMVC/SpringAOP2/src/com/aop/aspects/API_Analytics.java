package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class API_Analytics {

    @Before("com.aop.aspects.MyDemoLoggingAspect.forAdd()")
    public void performAnalyticsFirst()
    {
        System.out.println("performAnalyticsFirst");
    }
}
