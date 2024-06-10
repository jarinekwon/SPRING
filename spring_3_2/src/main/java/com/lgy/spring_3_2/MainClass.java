package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {	
		
		/*
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		*/
		
		String configLoc = "classpath:applicationCTX.xml";
//		classpath로 xml 객체 정보를 읽어서 configloc 변수에 저장
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
//		GenericXmlApplicationContext 클래스로 객체정보 파싱(해석)
//		업캐스팅으로 ctx 참조변수로 받음
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		MyCalculator myCalculator2 = ctx.getBean("myCalculator", MyCalculator.class);
//		MyCalculator myCalculator2 = ctx.getBean("myCalculator2", MyCalculator.class); // 오류 -> xml id myCalculator2로 수정 필요
//		getBean 메소드로 객체정보를 가져옴
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();

		myCalculator2.add();
		myCalculator2.sub();
		myCalculator2.mul();
		myCalculator2.div();
	}
}
