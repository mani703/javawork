package com.bit.day13;

class Lec01 extends java.lang.Thread {
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		for(int i=0; i<50; i++) {
			System.out.println(thr.getName() + ":" + i);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Lec01 thr2 = new Lec01();
		Lec01 thr3 = new Lec01();
		thr2.start();
		thr3.start();
		Thread thr = Thread.currentThread();
		for(int i=0; i<50; i++) {
			System.out.println(thr.getName() + ":" + i);
		}
//		thr2.run();
	}
}
