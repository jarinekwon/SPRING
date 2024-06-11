package com.lgy.spring_ex6_3;

import java.util.ArrayList;

public class Singer {
	private String name;
	private String member;
	private ArrayList<String> Song;
	
	
	public Singer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public ArrayList<String> getSong() {
		return Song;
	}
	public void setSong(ArrayList<String> song) {
		Song = song;
	}
	
	
}
