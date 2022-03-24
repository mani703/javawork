package com.bit.day05;

public class Ex14 {

	public static void main(String[] args) {

		int[] arr1=new int[] {1,2,3,4};
		arr1=new int[] {5,6,7};
		
		int[] arr2=new int[] {5,6,7};
		int[] arr3=new int[] {8,9};
		//System.out.println(arr1.length);
		//int[][] arr4=new int[][] {arr1,arr2,arr3};
		int[][] arr4=new int[4][3];
		//0의값을 4개를 가지는 행을 3줄 생성한다.
		for(int i=0;i<arr4.length;i++) {
			int[] temp = arr4[i];
			for(int j=0;j<temp.length;j++) {
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
