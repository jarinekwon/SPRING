package com.lgy.spring_ex2_4;

public class RectangleMedian {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setX(150);
		rec.setY(150);
		rec.process();
		
		Median med = new Median();
		med.setA(20);
		med.setB(100);
		med.setC(33);
		med.process();
	}
}
