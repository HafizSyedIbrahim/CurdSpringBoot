package com.multithreading.java;

public class MultiThreadmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread thread1 = new MyThread("ibrahim");
		thread1.start();
		System.out.println(thread1.getName());
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		
		
		
	}

}
