package com.lgy.spring_ex8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signaturStr = joinpoint.getSignature().toShortString();
		System.out.println("@@@### start ===>" + signaturStr);
		Object obj = null;
		try {
			obj = joinpoint.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("@@@### end ===>" + signaturStr);			
		}
		return obj;
	}
}
