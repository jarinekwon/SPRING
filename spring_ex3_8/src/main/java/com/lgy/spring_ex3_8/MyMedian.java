package com.lgy.spring_ex3_8;

public class MyMedian {
	private Median median;
	private int a;
	private int b;
	private int c;
	
	public void pc() {
		median.process(a, b, c);
	}
	
	public Median getMedian() {
		return median;
	}
	public void setMedian(Median median) {
		this.median = median;
	}
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
	
	
}
