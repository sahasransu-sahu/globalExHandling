package com.sahas.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("within(com.sahas.logging..*)")
    public void applicationPointCut() {
    }

    @AfterThrowing(pointcut = "applicationPointCut()",throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint,Throwable e) {
        System.out.println("Exception in "+ joinPoint.getSignature().getDeclaringTypeName() +"."+joinPoint.getSignature().getName()+"() with message= "+ e.getLocalizedMessage());
    }
}
