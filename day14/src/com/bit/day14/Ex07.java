package com.bit.day14;

class Lec07 extends Thread{
	
	public synchronized void func() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		func();
		System.out.println("스레드 종료");
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Lec07 target=new Lec07();
		Lec07 target2=new Lec07();
		target.start();
		target2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(target2) {//Lec07 객체
		target2.notify();
		}
	}

}
