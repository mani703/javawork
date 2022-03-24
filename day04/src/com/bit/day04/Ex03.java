package com.bit.day04;

public class Ex03 {
	public static int d=44444;
	public static void main(String[] args) {
	//지역변수
		int a=1111;
		func01(a);
		System.out.println("a="+ a);
		int b=func02();
		System.out.println("b+d="+ b+d);
	}
	public static void func01(int a) {
		System.out.println("func01 a="+a);
	}
	
	public static int func02() {
		//지역변수
		int b=2000;
		return b;
	}

}
