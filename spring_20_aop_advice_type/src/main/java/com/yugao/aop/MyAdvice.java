package com.yugao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {


    //切入点表达式：
//    @Pointcut("execution(void com.yugao.dao.BookDao.update())")
//    @Pointcut("execution(void com.yugao.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.yugao.dao.impl.BookDaoImpl.update(*))")    //no
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..*e(..))")
//    @Pointcut("execution(void com..*())")
//    @Pointcut("execution(* com.yugao.*.*Service.find*(..))")
    //执行com.yugao包下的任意包下的名称以Service结尾的类或接口中的save方法，参数任意，返回值任意
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


//    @Before("pointCut()")
//    public void before(){
//        System.out.println("before");
//    }

    @After("pointCut()")
    public void after(){
        System.out.println("after");
    }

    //@AfterReturning：返回后通知，在原始方法执行完毕后运行，且原始方法执行过程中未出现异常现象
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    //@AfterThrowing：抛出异常后通知，在原始方法执行过程中出现异常后运行
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
