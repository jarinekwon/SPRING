package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
//공통기능 클래스(Aspect)
public class LogAop {
		@Pointcut("within(com.lgy.spring_9_1.*)")
//		공통기능이 적용되는 범위
		private void pointCutMethod() {}
		
		@Around("pointCutMethod()") // 적용되는 메소드 명
//		메소드 실행 전/후, 예외처리 포함해서 공통기능 실행
		public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
			String signatureStr = joinpoint.getSignature().toShortString();
			System.out.println(signatureStr + "is start.");
			long st = System.currentTimeMillis();
			Object obj = null;
			
			try {
				obj = joinpoint.proceed();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				long et = System.currentTimeMillis();
				System.out.println(signatureStr + "is finished.");
				System.out.println(signatureStr + "경과시간: " + (et - st));
			}
			return obj;
		}
}
