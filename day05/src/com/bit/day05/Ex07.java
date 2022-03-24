package com.bit.day05;

public class Ex07 {
	//1. 자바 정규표현식 조사해오기, 예시
	//2. 학생 성적관리프로그램을 제작하는데
	//한 학생이 
	
	public static void main(String[] args) {
		String msg1="java";
		String msg2="Java";
		String msg3="ABCDE";
		
		char[] arr1= {'a','b','c','d','e'};
		msg3.getChars(3, 5, arr1, 0);//0부터 5까지의 arr1값중에서 0번째 인덱스번호 값 호출
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		String msg4="java,db,web,spring";
		String[] arr2=msg4.split(",");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
	}

}
