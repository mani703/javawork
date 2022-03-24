package com.bit.day05;
	//주민번호 확인 Ex03, Ex05로만 사용
		//주민번호를 입력하세요
		//input = "991231-1234567"; <-처음부터 String으로. 입력받는건 아직 x
		//당신은 24세 남성 입니다.
		//input = "220101-4123456";
		//당신은 1세 여성 입니다.
public class Ex05 {

	public static void main(String[] args) {
		String input="991231-1234567";
		System.out.println("주민번호를 입력하세요 > "+input);
		char[] arr1=input.toCharArray();//인덱스번호가 붙음
		
		int age=0;
		char gender='여';
		
		System.out.println(arr1[0]=='9');
		System.out.println('9'==57);//즉, '9'의 아스키코드는 57이다.
		System.out.println('9'-(57-9));
		//int year1=1900+(arr1[0]-48)*10+(arr1[1]-48);
		int year1=(arr1[0]-'0')*10+(arr1[1]-'0')*1+1900;
		if(arr1[7]=='1'||arr1[7]=='3') gender='남';
		if(arr1[7]=='2'||arr1[7]=='4') gender='여';
		age=2022-year1+1;
		
		System.out.println(year1+"년생의 당신은 "+age+"세 "+gender+"성입니다.");
		
		
		/*
		String input="991231-1234567";
		char[] arr1=input.toCharArray();
		int year, age;
		String song;
		
		if(arr1[7]=='1'||arr1[7]=='2') {
			year=1900+((arr1[0]-48)*10+(arr1[1]-48));
			age=2022-year+1;
				if(arr1[7]=='1')
					song="남성"; 
				else
					song="여성"; 
			System.out.println("당신은 "+age +"세 "+song+"입니다.");
		}
		else if(arr1[7]=='3'||arr1[7]=='4') {
			year=2000+((arr1[0]-48)*10+(arr1[1]-48));
			age=2022-year+1;
				if(arr1[7]=='3')
					song="남성"; 
				else
					song="여성"; 
			System.out.println("당신은 "+age +"세 "+song+"입니다.");
		
	}
	*/
	}

}
