package com.bit.day05;

public class Ex02 {

	public static void main(String[] args) {
		int su1 =1+2;//변수에 3을 저장시킨다.
		int su2 =1;
		int su3=su2+2;
		System.out.println(su1==su3);
		
		String st1="0x2222";
		String st2=new String("0x2222");//st2=""; 빈문자열 출력 
		String st3=null;//null출력
		String st4="";//st2와 동일한 값 반환
		String st5=new String("java"); //새로운 객체를 찍어내고있음.
		String st6="0x2222";
		if(su1+2==5) return;
		System.out.println(st2==st5);//false 새로운 객체끼리여서 주소값이 다름
		System.out.println(st1==st5);//false 주소가 다름
		System.out.println(st1==st6);//true 주소가 같음
		
	}

}
