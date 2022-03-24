package com.bit.day04;

public class Ex04 {
	public static int su=3322;//static 변수
	int du=1111;//non-static 변수
	public static void main(String[] args) {
		//우선순위 : 지역변수 > 전역변수
		int su=2222;
		Ex04 me=new Ex04();//객체를 선언해줘야함
		System.out.println("su="+su);
		System.out.println("Ex04 su="+Ex04.su);
		System.out.println("Ex04 du="+me.du);
	}
}
