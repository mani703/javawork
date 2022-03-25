package com.bit.day08;

public class Ex02 {

	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer();
		for(int i=0; i<17; i++) {
			st1.append("a");
			System.out.println(st1.capacity() + ">>" + st1);
		}
//		System.out.println(st1.capacity());
	}
}
