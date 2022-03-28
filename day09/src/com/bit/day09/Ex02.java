package com.bit.day09;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		BitArray arr = new BitArray();
		arr.add(1111);
		arr.add(2222);
//		arr.add(3333);
//		arr.add(4444);
		arr.add(5555);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
