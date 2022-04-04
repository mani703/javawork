package com.bit.day14;

class Lec08 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("thread working...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("main start...");
		Lec08 thr = new Lec08();
		// main스레드에 종속시킨다.
		thr.setDaemon(true);
		// main문의 스레드가 끝나면 thr의 스레드도 끝난다.
		// start하기전에 종속시켜야한다.
		thr.start();
		try {
			Thread.sleep(5000);// 5초뒤에 메인 스레드 끝남
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");

	}

}