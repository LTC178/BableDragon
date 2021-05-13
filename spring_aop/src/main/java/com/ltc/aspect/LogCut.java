package com.ltc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义切面 设置注解： @Aspect 由切入点与通知的结合
 * 
 * 定义切入点 Pointcut 规定需要拦截哪些方法，哪些方法需要处理 @PointCut("匹配规则")
 * 
 * 定义通知 前置通知 @Before 返回通知 @AfterReturn 异常通知 @AfterThrowing 最终通知 @After
 * 环绕通知 @Around
 */
@Component // 将对象交给IOC容器维护
// @Aspect // 表示当前是一个切面类
public class LogCut {
    /**
     * 定义切入点
     * 
     * 注：表达式的第一个* 代表的是方法的修饰范围 可选项：private protected public(* 表示所有范围)
     */
    // @Pointcut("execution(* com.ltc..*.*(..))")
    public void cut() {
        System.out.println("cut");
    }

    /**
     * 定义前置通知 方法执行前的通知
     */
    // value中的value字段的方法名一定要加括号表示是一个方法
    // @Before(value = "cut()")
    public void before() {
        System.out.println("前置通知... 方法执行前执行的通知");
    }

    /**
     * 定义返回通知...方法正常执行完时执行的通知(出现异常时不会通知)
     */
    // @AfterReturning(value = "cut()")
    public void afterReturn() {
        System.out.println("返回通知.. 方法正常执行时执行的通知");
    }

    /**
     * 定义最终通知 方法正常执行完时的通知(无论方法能否正常执行，即出现异常时也会通知)
     */

    // @After(value = "cut()")
    public void after() {
        System.out.println("最终通知...方法执行结束后执行的通知");
    }

    /**
     * 定义异常通知 方法执行抛出异常时执行的通知
     */
    // @AfterThrowing(value = "cut()", throwing = "e")
    public void throwReturn(Exception e) {
        System.out.println("异常通知...方法执行抛出异常时执行的通知" + e.getMessage());
    }

    // 环绕通知包含实现了上述四种通知
    // @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) {
        // 前置通知
        System.out.println("环绕通知-前置通知...");
        Object object = null;
        try {
            object = pjp.proceed();
            // 返回通知
            System.out.println("环绕通知-返回通知...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-异常通知...");
        }

        // 最终通知
        System.out.println("环绕通知-最终通知...");

        return object;
    }
}
