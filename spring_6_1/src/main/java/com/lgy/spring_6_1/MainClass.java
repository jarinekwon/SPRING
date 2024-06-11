package com.lgy.spring_6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLoc1 = "classpath:applicationCTX1.xml";
		String configLoc2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);
		Student student1 = ctx.getBean("student1", Student.class);
//		홍길동 객체정보 가져옴
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
//		student1 객체 참조
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		if (student1.equals(student2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("student1 != student2");
		}
//		동일한 객체로 출력
		
		Student student3 = ctx.getBean("student3", Student.class);
//		홍길자 객체정보 가져옴
		System.out.println(student3.getName());
		System.out.println(student3.getHobbys());
		
		if (student1.equals(student3)) {
			System.out.println("student1 == student3");
		} else {
			System.out.println("student1 != student3");
		}
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamaName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
		
		ctx.close();
	}
}
