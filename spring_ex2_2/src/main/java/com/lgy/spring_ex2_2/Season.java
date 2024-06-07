package com.lgy.spring_ex2_2;

public class Season {
	private int month;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public void seasonMonth() {
		if (month <= 5) {
			System.out.println("봄");
		} else if (month <= 8) {
			System.out.println("여름");
		} else if (month <= 11) {
			System.out.println("가을");
		} else if (month <= 12 || month <= 2) {
			System.out.println("겨울");
		}
	}
}
