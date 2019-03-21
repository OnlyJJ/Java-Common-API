package com.learn.test;

public class User {
	private int uid;
	private String name;
	private int age;
	private String sex;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString() {
		System.err.println("name = " + name + ",uid = " + uid + ",sex = " + sex + ",age = " + age);
		return "";
	}
}
