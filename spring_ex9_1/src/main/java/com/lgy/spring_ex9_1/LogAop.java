package com.lgy.spring_ex9_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("within(com.lgy.spring_ex9_1.*)")
	private void pointCutMethod() {}
	
	@Around("pointCutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println("@@@### start ===>" + signatureStr);
		Object obj = null;
		
		try {
			obj = joinpoint.proceed();
			return obj;
		} finally {
			System.out.println("@@@### end ===>" + signatureStr);
		}
	}
}
