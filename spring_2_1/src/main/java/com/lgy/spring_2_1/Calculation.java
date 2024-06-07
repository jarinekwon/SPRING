package com.lgy.spring_2_1;
//도메인 역순(패키지: lgy: legacy + spring_2_1 프로젝트 이름 포함)

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public void add() {
		System.out.println("add");
		System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
	}
	public void sub() {
		System.out.println("sub");
		System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
	}
	public void mul() {
		System.out.println("mul");
		System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
	}
	public void div() {
		if (secondNum != 0) {
			System.out.println("div");
			System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));			
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
}
