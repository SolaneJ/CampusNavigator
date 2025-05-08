package com.github.solanej.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 负责所有mybatis-mapper的切面，用于记录数据库所有操作
 *
 * @since 2025/5/8 20:56
 */
@Aspect
@Component
@Log
public class MapperAspect {

    @Around("execution(* com.github.solanej.mapper.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 记录方法执行前的时间
        long startTime = System.currentTimeMillis();
        // 执行方法
        Object result = joinPoint.proceed();
        // 记录方法执行后的时间
        long endTime = System.currentTimeMillis();
        // 计算方法执行时间
        long executionTime = endTime - startTime;
        // 打印方法执行时间
        log.info("Method <" + joinPoint.getSignature().getName() + "> executed in " + executionTime + "ms.");
        // 返回方法执行结果
        return result;
    }
}
