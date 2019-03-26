package com.example.demo.bean;


import java.util.Date;

public class User {

	private int id;
	
	private String name;
	
	private String phone;
	
	private int age;
	
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User(int id, String name, String phone, int age, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.createTime = createTime;
	}

	public User() {
		super();
	}

	
	
	
}
