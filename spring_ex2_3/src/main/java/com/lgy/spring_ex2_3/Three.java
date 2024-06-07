package com.lgy.spring_ex2_3;

public class Three {
	private int three;

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}
	
	public void threemul() {
		if (three % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수 아닙니다.");
		}
	}
	
}
