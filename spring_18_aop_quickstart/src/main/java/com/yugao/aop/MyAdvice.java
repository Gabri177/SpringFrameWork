package com.yugao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.yugao.dao.*.update(..))")
    private void pointCut() {}

//    @Around("pointCut()")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        System.out.println("----------1");
//        Object proceed = joinPoint.proceed();
//        System.out.println("----------2");
//        return proceed;
//    }


    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }
}
