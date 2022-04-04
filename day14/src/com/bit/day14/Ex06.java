package com.bit.day14;

public class Ex06 extends Thread {
	int su1, su2;
	static int sum;
	
	public synchronized static void func2(int i) {
			int temp = sum+i;
			sum = temp;			
			System.out.println(Thread.currentThread().getName());
	}
	
	public synchronized void func1(int su1, int su2) {
		for(int i=su1; i<=su2; i++) {
			int temp = sum+i;
			sum = temp;			
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		func1(su1, su2);
		
//		for(int i=su1; i<=su2; i++) {
//			func2(i);
//		}
		
//		for(int i=su1; i<=su2; i++) {
//			synchronized(key) {
//				int temp = sum+i;
//				sum = temp;			
//			}
//			System.out.println(Thread.currentThread().getName());
//		}
	}
	
//	Object key; //= new Object();

	public static void main(String[] args) {
		// sum=4950
//		int su1 = 1;
//		int su2 = 100;
//		int sum = 0;
		Ex06 me1 = new Ex06();
		Ex06 me2 = new Ex06();
//		me1.key = me1;
//		me2.key = me1;
		
		me1.su1 = 1;
		me1.su2 = 5000;
		me2.su1 = 5001;
		me2.su2 = 10000;
		
		me1.start();
		me2.start();
		
		try {
			me1.join();
			me2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("sum=" + (sum));
	}

}
