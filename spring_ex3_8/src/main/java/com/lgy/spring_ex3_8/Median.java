package com.lgy.spring_ex3_8;

public class Median {
	public void process(int a, int b, int c) {
		if ((b > a && a > c) || (c > a && a > b)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + a);
		} else if ((a > b && b > c) || (c > b && b > a)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + b);
		} else if ((a > c && c > b) || (b > c && c > a)) {
			System.out.println("입력된 정수가 " + a + "와 " + b + "와 " + c +"의 중간 값은 " + c);
		}
	}
}
