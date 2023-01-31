package com.multithreading.java;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {		
			System.out.println("I am thread2");
			System.out.println("I am running in thread2");
		}
	}
}
