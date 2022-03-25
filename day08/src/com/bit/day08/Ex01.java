package com.bit.day08;

public class Ex01 {

	public static void main(String[] args) {
		String st1 = "java";
//		String st2 = new String("java");
		String st2 = st1;
		st2 = st1.concat("Edit");
		System.out.println(st1);
		System.out.println(st2);
		
		//StringBuffer, StringBuilder : 자기 자신이 바뀌는 클래스
		StringBuffer st3 = new StringBuffer("java");
//		StringBuffer st4 = "java";	// type이 다르다
		
		StringBuffer st4 = st3;
		st3.append("Edit");
		
		System.out.println(st3);
		System.out.println(st4);
	}

}
