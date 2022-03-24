package com.bit.day04;

public class Ex10 {
	public static final int su1=1111;
	public final int su2;
	
	public Ex10() {
		func01();
		su2=2222;
	}
	public Ex10(int a) {
		su2=a;
	}
	public void func01() {
		
	}
	public static void main(String[] args) {
		//상수형 변수 = 값이 변하지 않는 변수
		final int a;
		a=2;
		Ex10 me1=new Ex10();
		System.out.println(me1.su2);
		me1=new Ex10(1234);
		System.out.println(me1.su2);
		
	}

}
