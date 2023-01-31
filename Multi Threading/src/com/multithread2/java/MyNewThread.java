package com.multithread2.java;

public class MyNewThread implements Runnable {
			
		public void run() {
		for(int i=0; i<1000; i++) {
		System.out.println("Thread name is MyNewThread");
		System.out.println("My New Thread is running into Runnable Interface");
		}
		}
}
