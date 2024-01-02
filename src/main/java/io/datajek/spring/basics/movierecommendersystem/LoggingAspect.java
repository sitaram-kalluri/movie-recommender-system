package io.datajek.spring.basics.movierecommendersystem;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut(value = "execution(* io.datajek.spring.basics.movierecommendersystem.controller..*(..))")
    public void logBefore() {

    }

    @Before("logBefore()")
    public void beforeAdvice() {
        System.out.println("Before UserAspect >>>>> ");
    }

    @AfterReturning(pointcut = "execution(* io.datajek.spring.basics.movierecommendersystem.controller..*(..))", returning = "retval")
    public void logAfter(JoinPoint joinPoint, Object retval) {
        System.out.println("After Aspect JoinPoint "+ joinPoint.toString());
        System.out.println("After UserAspect >>>>>" + retval);
    }


}
