package com.lgy.spring_ex2_2;

public class Won2dollar {
	private double won;
	private double dollar;
	
	public double getWon() {
		return won;
	}
	public void setWon(double won) {
		this.won = won;
	}
	public double getDollar() {
		return dollar;
	}
	public void setDollar(double dollar) {
		this.dollar = dollar;
	}
	
	public void rate() {
		dollar = won/1200;
		System.out.println("$" + dollar);
	}
}
