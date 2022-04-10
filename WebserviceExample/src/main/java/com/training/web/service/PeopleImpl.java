package com.training.web.service;

public class PeopleImpl implements People {

	private String name = "Amit";
	
	@Override
	public String getName() {
		System.out.println("get name called");
		return name;
	}

	@Override
	public void setName(String name) {
		System.out.println("set name called : " + name);
		this.name = name;
	}

	@Override
	public int getAge() {
		return 20;
	}

}
