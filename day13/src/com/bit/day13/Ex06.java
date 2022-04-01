package com.bit.day13;

public class Ex06 extends Thread {
	
	public Ex06(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Runnable work = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread thr1 = new Thread(work, "thread1");
//		thr1.setName("스레드1");
		thr1.start();
		
		Ex06 me = new Ex06("thread2");
//		me.setName("스레드2");
		me.start();
	}
	
	@Override
	public void run() {
		System.out.println(getName());
	}

}
