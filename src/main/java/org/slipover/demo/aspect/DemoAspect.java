package org.slipover.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Pointcut("@annotation(org.slipover.demo.aspect.point.DemoPoint)")
    public void demo() { }

    @Around("demo()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("我是DemoAOP，我切入到方法：" + methodSignature.getMethod().getName());
        return proceedingJoinPoint.proceed();
    }

}
