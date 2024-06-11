package com.lgy.spring_ex6_1;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int salary;
	private ArrayList<String> certifi;
	
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public ArrayList<String> getCertifi() {
		return certifi;
	}
	public void setCertifi(ArrayList<String> certifi) {
		this.certifi = certifi;
	}
	
	
}
