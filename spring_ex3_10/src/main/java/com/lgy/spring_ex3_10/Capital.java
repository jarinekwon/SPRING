package com.lgy.spring_ex3_10;

public class Capital {
	public void alphabet(String s) {
		char c = s.charAt(0);
		char a = 'A';
		for (char i = c; i >= a; i--) {
			for (int j = a; j <= i ; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
