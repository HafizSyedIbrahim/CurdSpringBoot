package com.multithreading.java;

public class MyThread extends Thread {
	
	public MyThread(String name) {
		System.out.println("Thread name is:"+name);
	}
	
	@Override
	public void run() {
		for (int i=0; i<1000; i++) {
			
			System.out.println("My Name is  Ibrahim");
			System.out.println("Resident of Lahore");
		}
	}
}
