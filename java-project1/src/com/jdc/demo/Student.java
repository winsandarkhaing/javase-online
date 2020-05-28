package com.jdc.demo;

public class Student {
	private String name;
	private int age;
	private String school;
	
	public static void main(String[] args) {
		Student stu=new Student();
		System.out.println(stu);
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	
	
}
