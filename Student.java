package com.edubridge.smsapp;

public class Student {
	
	private int id;
	private String name;
	private double stipend;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int id, String name, double stipend, int age) {
		super();
		this.id = id;
		this.name = name;
		this.stipend = stipend;
		this.age = age;
	}
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
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + stipend + ", age=" + age + "]";
	}
	
}