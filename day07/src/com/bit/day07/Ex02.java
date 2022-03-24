package com.bit.day07;

public class Ex02 {

	public static void main(String[] args) {
		byte su1 = 127;
		Byte su2 = new Byte(su1);
		Byte su3 = new Byte("127");
		
		System.out.println(su3);
		System.out.println(su2 == su3);	// 주소값이 달라서 서로 다른 객체를 가르킴
		System.out.println(su2.equals(su3));
		
		long su4 = 4444;
		Long su5 = new Long(su4);
		Long su6 = new Long(4444);
		Long su7 = new Long(4444L);
		Long su8 = new Long("8888"); // new Long("8888L"); x -> 문자열로 인식
	}

}
