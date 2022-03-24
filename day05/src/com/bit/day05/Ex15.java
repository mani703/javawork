package com.bit.day05;

public class Ex15 {

	public static void main(String[] args) {
		String[] arr1= new String[] {new String("java"),new String("web"),new String("spring")};
		//String의 객체를 3개 가지는 arr1 객체배열을 선언한다.
		arr1[0]=arr1[0].toUpperCase();
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		int [][]arr2=new int[][] {new int[] {}, new int[] {}};
		int [][]arr3=new int[][] {{},{}};

	}

}
