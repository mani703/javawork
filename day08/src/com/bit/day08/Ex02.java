package com.bit.day08;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer(1);
		st1.append("1");
		System.out.println(st1.capacity());
		st1.append("2");		
		st1.trimToSize();	// 안쓰는 버퍼를 날려버린다.
		System.out.println(st1.capacity());
		
//		for(int i=0; i<17; i++) {
//			st1.append("a");
//			System.out.println(st1.capacity() + ">>" + st1);
//		}
	}
}
