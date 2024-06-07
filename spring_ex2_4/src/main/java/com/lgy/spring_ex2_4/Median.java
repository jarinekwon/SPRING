package com.lgy.spring_ex2_4;

public class Median {
	private int a;
	private int b;
	private int c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public void process() {
		if ((b > a && a > c) || (c > a && a > b)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + a);
		} else if ((a > b && b > c) || (c > b && b > a)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + b);
		} else if ((a > c && c > b) || (b > c && c > a)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + c);
		}
	}
}
