package com.ultradev.springaop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogArgumentAdvice {
    @Before("@annotation(LogArgument)")
    public void logArgument(JoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.getSignature() + " executed in " + joinPoint.getArgs() );

    }
}
