package com.bit.day07;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 0, 4};
		
		for(int i=0; i<5; i++) {
			try {
				System.out.println(1/arr1[i]);
			} catch(ArithmeticException e) {
				e.printStackTrace();
			} catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}
}
