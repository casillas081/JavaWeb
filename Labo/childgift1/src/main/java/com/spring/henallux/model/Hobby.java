package com.spring.henallux.model;

public class Hobby {
	
	private String id;
	private String name;
	
	public Hobby(String id, String n){
		this.id = id;
		name = n;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}

}
