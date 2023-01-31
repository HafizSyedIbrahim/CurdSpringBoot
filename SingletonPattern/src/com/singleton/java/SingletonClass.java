package com.singleton.java;

public class SingletonClass {
	private String name;
	
	static SingletonClass singleton = new SingletonClass("My Singleton Object Name is Ibrahim");
	private SingletonClass(String name){
		this.name = name;
		System.out.println(name);
	}
	public String getStudentName() {
		return this.name;
	}
	public static SingletonClass getInstance() {
		return singleton;
	}
	public void getConnection() {
		System.out.println("Get conncetion");
	}
}
