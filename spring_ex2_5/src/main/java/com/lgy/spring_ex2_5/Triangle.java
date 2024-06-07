package com.lgy.spring_ex2_5;

public class Triangle {
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
		if ((a + b > c) || (c + b > a) || (a + c > b)) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안됩니다.");
		}
	}
}
