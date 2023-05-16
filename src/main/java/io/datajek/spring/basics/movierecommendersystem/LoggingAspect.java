package io.datajek.spring.basics.movierecommendersystem;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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


}
