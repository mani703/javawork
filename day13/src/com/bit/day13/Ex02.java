package com.bit.day13;

public class Ex02 extends Thread{

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.start();
		Thread thr1 = Thread.currentThread();
		System.out.println(thr1.getName());
	}
	
	@Override
	public void run() {
//		Thread thr2 = this.currentThread();
		System.out.println(this.getName());
	}
}
