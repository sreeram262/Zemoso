package com.aop.aspects;


import com.aop.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Pointcut("execution(public void add*(..))")
    public  void forAdd(){}

    @Pointcut("execution(* com.aop.dao.*.*())")
    public  void forPackageMethods(){}

    @Pointcut("execution(* get*())")
    public  void forGetters(){}

    @Pointcut("execution(* set*())")
    public  void forSetters(){}

    @Pointcut("forPackageMethods() && !(forGetters() || forSetters())") //can also use like this so to apply on certain methods only
    public void forPackageWithoutGettersandSetters(){} //combining the pointcut expressions...package methodsonly without the getters and setters
    //@Before("execution(public void addAccount())")   // inside before is known as point cut expression
    //@Before("execution(public void add*())")
    //@Before("execution(* * add*())")
    //@Before("execution(* * add*(*,void))") can also use wildcards on parameters
    //@Before("forPackageWithoutGettersandSetters()")
    @Before("forAdd()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {

        System.out.println("\n=====>>> Executing @Before advice on addAccount()");
        System.out.println(joinPoint.getSignature());

        Object[] args=joinPoint.getArgs();
        if(args.length!=0)
        {
            for(var temp: args)
            {
                System.out.println(temp);
            }
        }

    }

    @Pointcut("execution(public * get*())")
    public void getMethods(){}
    @AfterReturning(value = "getMethods()",returning = "accounts")
    public void accountsInfo(JoinPoint joinPoint, List<Account> accounts)
    {
        System.out.println("Accounts info:");
        System.out.println(joinPoint.getSignature());

        for(var temp:accounts)
        {
            temp.setLastName("kurosaki");
        }
    }

    @Pointcut("execution(* exception*())")
    public void forException(){}

    @AfterThrowing(value = "forException()",throwing = "exc")
    public void handlingException(JoinPoint joinPoint,Throwable exc)
    {
        System.out.println(joinPoint.getSignature());
        System.out.println(exc.toString());
    }
}




