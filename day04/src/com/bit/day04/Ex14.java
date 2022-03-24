package com.bit.day04;

public class Ex14 {

	public static void main(String[] args) {
		//배열
		//자료형[] 변수명 = new 자료형[길이];
		//변수명[인덱스]
		//인덱스 - 0부터 시작해서 n-1까지 연속된 숫자를 가지게 된다.
		//int[] arr=new int[5];
		//for(int i=0;i<5;i++) {
		//	arr[i]=2*(i+1);
		//	System.out.println(arr[i]);
		//}
		int[] arr1=new int[5];
		int[] arr2=new int[] {2,4,5,6,7};
		int[] arr3;
		arr3=new int[5];
		int[] arr4;
		arr4=new int[] {2,3,4,5,6,7};
		for(int i=0;i<5;i++) {
			arr1[i]=2*(i+1);
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr1.length);
	}

}
