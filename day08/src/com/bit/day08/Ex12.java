package com.bit.day08;

import java.util.Arrays;
import java.util.Random;


public class Ex12 {

	public static void main(String[] args) {
		// 로또 번호생성기(ver 0.1.0)	1 ~ 45
		// 4, 44, 23, 33, 12, 2
		// 2, 4, 12, 23, 33, 44 + 보너스 번호
		//////////////////////////////////
		// Arrays.sort() 제외
		//////////////////////////////////
		//1. 전형적인
		//////////////////////////////////
		// 1. 랜덤 (1 ~ 45);
		// 2. 중복값 검출
		// 3. sort
		
//		int ran = -1;
//		
//		while(true) {
//			ran = (int)(Math.random()*100); // 0 <= random < 1
//			if(ran > 0 || ran <= 45) { break; }
//		}
		
		int[] lotto = new int[7];
		for(int i=0; i<lotto.length; i++) {
			int ran = (int)(Math.random()*45)+1;
			lotto[i] = ran;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		int temp = -1;
		for(int i=0; i<5; i++) {
			for(int j=1+i; j<6; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

//		boolean[] check = new boolean[45];
//		int[] lottoNumber = new int[6];
//		int lottoCount = 0;
//		Random rd = new Random();
//		int bonusNumber = rd.nextInt(45) + 1;
//		check[bonusNumber] = true;
//		
//		while(lottoCount != 6){
//			int number = rd.nextInt(45) + 1;
//			
//			if(check[number-1] == true) {
//				continue;
//			} else {
//				lottoNumber[lottoCount++] = number;
//			}
//		}
//		
//		for(int i=0; i<lottoNumber.length-1; i++) {
//			for(int j=i+1; j<lottoNumber.length; j++) {
//				if(lottoNumber[i] > lottoNumber[j]) {
//					int temp = lottoNumber[i];
//					lottoNumber[i] = lottoNumber[j];
//					lottoNumber[j] = temp;
//				}
//			}
//		}
//		
//		for(int i=0; i<lottoNumber.length; i++) {
//			System.out.print(lottoNumber[i] + " ");
//		}
//		System.out.println("+" + bonusNumber);
	
	}
}
