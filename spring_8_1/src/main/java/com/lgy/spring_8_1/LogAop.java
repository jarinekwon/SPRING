package com.lgy.spring_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
//공통기능 클래스(Aspect)
		public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
//		joinpoint -> 핵심기능(공통기능이 적용되는 대상-메소드)
//		loggerAop -> advice(공통기능 자체-메소드)
			String signatureStr = joinpoint.getSignature().toShortString();
//			getSignature().toShortString() -> 핵심기능 클래스의 메소드 정보를 가지고 옴
			System.out.println(signatureStr + "is start.");
//			핵심기능이 start 됨(공통기능 실행(advice))
			long st = System.currentTimeMillis();
			Object obj = null;
			
			
//			*. 1번 방식
			/*
			try {
				obj = joinpoint.proceed(); // 예외처리 추가
//				핵심기능 실행
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				long et = System.currentTimeMillis();
				System.out.println(signatureStr + "is finished.");
				System.out.println(signatureStr + "경과시간: " + (et - st));
			}
			
			return obj; // 핵심기능 반환
			*/		
			
//			*. 2번방식
			
			try {
				obj = joinpoint.proceed();
				return obj;
			} finally {
				long et = System.currentTimeMillis();
				System.out.println(signatureStr + "is finished.");
				System.out.println(signatureStr + "경과시간: " + (et - st));
			}
		}
}
