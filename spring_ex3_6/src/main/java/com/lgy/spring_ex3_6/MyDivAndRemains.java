package com.lgy.spring_ex3_6;

public class MyDivAndRemains {
	private DivAndRemains divandremains;
	private int num;
	
	public void pc() {
		divandremains.process(num);
	}
	
	public DivAndRemains getDivandremains() {
		return divandremains;
	}
	public void setDivandremains(DivAndRemains divandremains) {
		this.divandremains = divandremains;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
