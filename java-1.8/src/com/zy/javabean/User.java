package com.zy.javabean;

import com.google.gson.annotations.Expose;

public class User {
	private String id;
	private String name;
	private String age;
	private UserAddress userAddress;
	
	
	public User() {
		super();
	}
	
	public User(String id, String name, String age, UserAddress userAddress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.userAddress = userAddress;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
}
