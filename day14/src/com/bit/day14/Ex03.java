package com.bit.day14;

class Lec03 extends Thread {
	
	public void run() {
		for(int i=0; i<200; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Thread thr0 = Thread.currentThread();	// main Thread
		System.out.println("main start...");
		Lec03 thr1 = new Lec03();
//		Lec03 thr2 = new Lec03();
		Thread thr3 = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Exception 발생...");
				thr0.interrupt();	// main 스레드 exception 발생으로 catch 실행
			}
		};
		thr1.start();
		thr3.start();
		try {
			thr1.join();	// join을 함으로 인해 main 스레드 일시 정지
//			thr2.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();	// join 탈출로 main 스레드 재시작
		}
		
		
		System.out.println("main end...");
	}

}
