package com.lgy.spring_ex2_6;


public class Capital {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}



	public void process() {
		char c = s.charAt(0);
		char a = 'A';
		for (char i = c; i >= a; i--) {
			for (int j = a; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}