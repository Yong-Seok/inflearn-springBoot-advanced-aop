package hello.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* hello.aop.order..*(..))")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        // Around는 포인트컷, doLog는 어드바이스가 된다.
        log.info("[log] {}", joinPoint.getSignature()); // join point 시그니쳐
        return joinPoint.proceed(); // target 호출
    }
}