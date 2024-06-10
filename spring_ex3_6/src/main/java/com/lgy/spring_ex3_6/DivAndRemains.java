package com.lgy.spring_ex3_6;

public class DivAndRemains {
	public void process(int num) {
		if (num/10 == num%10) {
			System.out.println("입력된 수: " + num + "은(는) 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("입력된 수: " + num + "은(는) 10의 자리와 1의 자리가 다릅니다.");

		}
	}
}
