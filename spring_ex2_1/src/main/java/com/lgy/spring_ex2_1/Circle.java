package com.lgy.spring_ex2_1;

public class Circle {
	private int radius;
	private final double PI = 3.14;
	
	public void carea() {
		System.out.println("원의 면적은 " + (radius*radius*PI));
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	
	
}
