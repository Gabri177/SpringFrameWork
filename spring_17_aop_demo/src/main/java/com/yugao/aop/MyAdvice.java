package com.yugao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.yugao.dao.BookDao.*(..))")
    private void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("front side");
        Object proceed = joinPoint.proceed();
        System.out.println("after side");
        return proceed;
    }

}
