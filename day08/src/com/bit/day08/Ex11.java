package com.bit.day08;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		char[] arr1 = {'a', 'b', 'c', 'd'};
//		System.out.println(new int[] {1,2,3,4});
		System.out.println(java.util.Arrays.toString(arr1));	// 인자를 받아서 배열의 내부를 보여줌
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);		// 깊은 복사
		arr1[0] = 'd';
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1 == arr2);
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = new int[4];
		Arrays.fill(arr4, 1234);
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = {3, 2, 8, 1, 5};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		int idx = Arrays.binarySearch(arr5, 3);
		System.out.println("3 val=" + idx);
	}

}
