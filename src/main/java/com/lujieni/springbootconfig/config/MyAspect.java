package com.lujieni.springbootconfig.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther ljn
 * @Date 2019/11/28
 * 切面类
 */
@Aspect //必须要
@Component //必须要
public class MyAspect {

    @Pointcut("@annotation(com.lujieni.springbootconfig.annotation.MyAnnotation)")
    private void filter() {

    }

    @Before(value = "filter()")
    public void before(JoinPoint point) {
        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());
        System.out.println("before:连接点方法为：" + methodName + ",参数为：" + args);
        /*
           before没有办法阻止目标方法的执行除了抛异常,
           即使抛了异常,after和afterThrowing仍旧会执行
         */
        throw new RuntimeException("haha");
    }

    /*
       当连接点方法成功执行后，返回通知方法才会执行，
       如果连接点方法出现异常，则返回通知方法不执行!!!
       返回通知方法在目标方法执行成功后才会执行，
       所以，返回通知方法可以拿到目标方法(连接点方法)执行后的结果。
     */
    @AfterReturning(value = "filter()",returning = "result")
    public void afterReturning(JoinPoint point, Object result) {
        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());
        System.out.println("afterReturning:连接点方法为：" + methodName + ",参数为：" + args + ",目标方法执行结果为：" + result);
    }

    /**
     * after出不出异常都会执行
     * @param point
     */
    @After(value = "filter()")
    public void after(JoinPoint point) {
        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());
        System.out.println("after:连接点方法为：" + methodName + ",参数为：" + args);
    }


    /**
     * 一般不会运行,只有出现了异常才会执行
     * @param point
     * @param ex
     */
    @AfterThrowing(value = "filter()",throwing = "ex")
    public void afterThrowing(JoinPoint point, Exception ex){
        String methodName = point.getSignature().getName();
        List<Object> args = Arrays.asList(point.getArgs());
        System.out.println("afterThrowing:连接点方法为：" + methodName + ",参数为：" + args+",异常为:"+ex);
    }
}
