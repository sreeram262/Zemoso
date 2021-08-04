package com.aop.aopdemo.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FinallyDemo {

    @Around("execution(* getFortune(..))")
    public Object executeAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.getSignature()); // proceedingJoinPoint gives us the handle to the target
        long start=System.currentTimeMillis();

        Object result;
        try {
            result=proceedingJoinPoint.proceed();

        } catch (Throwable throwable) {
            //throw throwable;
            result="Stay safe!!!";
        }

        long end=System.currentTimeMillis();
        System.out.println("execution time: "+(end-start)/1000.0);

        return result;

    }
}
