package com.bit.day13;

public class Ex04 {
	static Runnable obj = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	});
	
	
	public static void main(String[] args) {
		
		
		Thread thr1 = new Thread(obj);
		thr1.start();
		Thread thr3 = new Thread(obj);
		thr3.start();
		
		Thread thr2 = new Thread() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			};
		};
		thr2.start();
	}

}
