package com.lgy.spring_ex2_1;

public class Draw {
	public static void main(String[] args) {
		
		Circle cdraw = new Circle();
		cdraw.setRadius(10);
		cdraw.carea();
//		Draw 클래스가 Circle 클래스에 의존
//		Circle 클래스로 객체 생성해서 값을 주입
//		의존+주입(Dependency Injection): DI

		Rectangle rdraw = new Rectangle();
				
		rdraw.setWidth(20);
		rdraw.setHeight(30);
		rdraw.rarea();
//		Draw 클래스가 Rectangle 클래스에 의존
//		Rectangle 클래스로 객체 생성해서 값을 주입
//		의존+주입(Dependency Injection): DI
	}
}
