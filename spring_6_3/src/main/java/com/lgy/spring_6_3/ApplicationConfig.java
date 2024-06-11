package com.lgy.spring_6_3;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//스프링 설정파일로 사용
public class ApplicationConfig {
	@Bean
//	빈 객체 생성
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
//	@Bean
////	빈 객체 생성
//	public Student student2() {
//		ArrayList<String> hobbys = new ArrayList<String>();
//		hobbys.add("독서");
//		hobbys.add("음악감상");
//		
//		Student student = new Student("홍길순", 10, hobbys);
//		student.setHeight(170);
//		student.setWeight(55);
//		
//		return student;
//	}
}
