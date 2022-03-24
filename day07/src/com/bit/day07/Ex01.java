package com.bit.day07;

public class Ex01 {

	public static void main(String[] args) {
		int su1 = 1111;
		Integer su2 = new Integer(127);
		Integer su3 = new Integer("3333");	// 반드시 숫자로만 구성 (소수점, 문자)x, 부호는 허용
		Integer su4 = 4444;		// 오토박싱 -> new Integer(4444)
		int su5 = su2;			// 언박싱
		Integer su6 = su2 + su3;	// 언박싱 -> 연산 -> 오토박싱
		
		System.out.println(su2);
		System.out.println(su3+1);	// 문자열을 숫자로
		System.out.println(su5);	
		System.out.println(su6);	
		System.out.println(Integer.MAX_VALUE);
		System.out.println(su2.byteValue());
		
		int su7 = Integer.parseInt("7777");
		System.out.println(su7);
		
		Integer su8 = Integer.valueOf("8888");
		System.out.println(su8);
		
		int su9 = 0xac00;
		System.out.println(su9);
		System.out.println(0xac00);
		int su10 = 16;
		System.out.println("2진수:" + Integer.toBinaryString(su10));
		System.out.println("8진수:" + Integer.toOctalString(su10));
		System.out.println("16진수:" + Integer.toHexString(su10));
	}

}
