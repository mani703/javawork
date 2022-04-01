package com.bit.day13;

class Lec03 implements Runnable {
	@Override
	public void run() {
		Thread thr3 = Thread.currentThread();
		System.out.println(thr3.getName());
	}
}

public class Ex03 implements Runnable {

	public static void main(String[] args) {
		Ex03 obj = new Ex03();
		Thread thr2 = new Thread(obj);
		Thread thr3 = new Thread(obj);
		thr2.start();
		thr3.start();
		
		Thread thr1 = Thread.currentThread();
		System.out.println(thr1.getName());
	}

	@Override
	public void run() {
		Thread thr3 = Thread.currentThread();
		System.out.println(thr3.getName());
	}

}
