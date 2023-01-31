package com.singleton.java;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass obj = SingletonClass.getInstance();
		obj.getConnection();
		SingletonClass obj1 = SingletonClass.getInstance();
		
		
	}

}
