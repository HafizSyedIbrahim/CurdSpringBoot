package com.multithread2.java;

public class MultiThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewThread bullet1 = new MyNewThread();
		Thread gun = new Thread(bullet1);
		Threadrunnable bullet2 = new Threadrunnable();
		Thread gun2 = new Thread(bullet2);
		gun.start();
		gun2.start();
		gun.getName();
	}

}
