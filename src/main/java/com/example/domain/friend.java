package com.example.domain;

public class friend {
	private String name;

	public friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "friend [name=" + name + "]";
	}

	public static void add(friend friend1) {
		// TODO Auto-generated method stub
		
	}
	
}
