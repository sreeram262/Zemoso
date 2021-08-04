package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger; //can also use slf4j

@Aspect
@Component
public class CRMLoggingAspect {
    private Logger myLogger=Logger.getLogger(getClass().getName());

    @Pointcut("execution(* controllers.*.*(..))")
    public  void forControllers(){}

    @Pointcut("execution(* services.*.*(..))")
    public  void forServices(){}

    @Pointcut("execution(* DAO.*.*(..))")
    public  void forDao(){}

@Pointcut("forControllers() || forServices() || forDao()")
    public void appFlow() {}

    @Before("appFlow()")
    public void before(JoinPoint joinPoint)
    {
        myLogger.info("=====> Before ");
        //String method=joinPoint.getSignature().toShortString();
        myLogger.info("=====> Before calling method : "+joinPoint.getSignature());

    }

    @AfterReturning(value = "appFlow()",returning = "result")
    public void after(JoinPoint joinPoint,Object result)
    {
        myLogger.info("====> After");
        //String method=joinPoint.getSignature().toShortString();
        myLogger.info("=====> After calling method : "+ joinPoint.getSignature()+",args:"+result);

    }

}
