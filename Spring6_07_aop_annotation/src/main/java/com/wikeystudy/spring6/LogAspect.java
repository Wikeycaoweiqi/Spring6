package com.wikeystudy.spring6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
@Component
@Aspect
public class LogAspect {

    @Before(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[LOG] beforeMethod..." + " method name... " + methodName + " args... " + Arrays.asList(args));
    }

    @After(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[LOG] afterMethod..." + " method name... " + methodName + " args... " + Arrays.asList(args));
    }

    @AfterReturning(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))", returning = "result")
    public void returnMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[LOG] returnMethod..." + " method name... " + methodName + " args... " + Arrays.asList(args) + " result..." + result);
    }

    @AfterThrowing(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[LOG] afterThrowing..." + " method name... " + methodName + " args... " + Arrays.asList(args) + " ex..." + ex);
    }

    @Around(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("[LOG] aroundMethod...before");
            result = joinPoint.proceed();
            System.out.println("[LOG] aroundMethod...return");
        } catch (Throwable throwable) {
            System.out.println("[LOG] aroundMethod...throwable");
        } finally {
            System.out.println("[LOG] aroundMethod...after");
        }
        return result;
    }

    @Pointcut(value = "execution(public int com.wikeystudy.spring6.Calculator.*(..))")
    public void pointCut() {

    }
}