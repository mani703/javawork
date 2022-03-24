package com.bit.day04;

public class Ex05 {
	public int su1=1111;
	
	public static void main(String[] args) {
		
		Ex05 me = new Ex05();
		System.out.println("Ex05 su1 = "+me.su1);
		func1();
		System.out.println("after Ex05 su1 = "+me.su1);
	}

	public static void func1() {
		Ex05 me = new Ex05();//지역객체..
		System.out.println("func1 su1 = "+me.su1);
		me.su1++;
		System.out.println("after + su1 = "+me.su1);
	}
}
