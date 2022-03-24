package com.bit.day06;
import java.text.*;
import java.util.Collections;
import java.util.List;
public class Ex16 {

	public static void main(String[] args) {
		double su2=3.14;
		System.out.println(Math.random());
		
		
		for(int i = 0; i < 10; i++) {
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 10);
		    System.out.println(iValue);
		}
		for(int i = 0; i < 10; i++) {
		    double dValue = Math.random();
		    char cValue = (char)((dValue * 26) + 65);   // 대문자
		    //char cValue = (char)((dValue * 26) + 97); // 소문자

		    System.out.println(cValue);
		    
		}
	}

}
