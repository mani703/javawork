package com.bit.day04;

public class Ex02 {
	//클래스 변수
	public static int su1=1111;
	//멤버필드, 인스턴스 변수
	public int su2=2222;
	public void func01() {
		System.out.println(su1); //Ex02.su1도 가능
		System.out.println(su2);
	}
	
	public static void main(String[] args) {
		//클래스의 구성요소
		//1. 메서드
		//2. 변수
		System.out.println(su1);
		//System.out.println(Ex02.su1);
		Ex02 me=new Ex02();
		System.out.println(me.su2);
		me.func01();

	}

}
