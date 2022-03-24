package com.bit.day04;

public class Ex11 {

	public final int su;
	public Ex11() {
		//su=0;
		this(0);
		System.out.println("su="+su);
	}
	public Ex11(int a) {
		this(a,3);
		System.out.println("객체의 생성 su="+su);
	}
	public Ex11(int a,int b) {
		su=a+b;
		System.out.println("객체의 생성 객체의 생성 su="+su);
	}
	public static void main(String[] args) {
		Ex11 me = new Ex11();
		//me=new Ex11(10);
		//me=new Ex11(20,30);
	}

}
