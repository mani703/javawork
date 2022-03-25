package com.bit.day08;

import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		// 로또 번호생성기(ver 0.1.0)	1 ~ 45
		// 4, 44, 23, 33, 12, 2
		// 2, 4, 12, 23, 33, 44 + 보너스 번호
		//////////////////////////////////
		// Arrays.sort() 제외
		//////////////////////////////////
		//3. 아이디어
		//////////////////////////////////
		
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = 1+i;
		}		
		System.out.println(Arrays.toString(lotto));
		
		int temp = -1;
		for(int i=0; i<1000; i++) {
			int su = (int)(Math.random()*44) + 1;
			temp = lotto[0];
			lotto[0] = lotto[su];
			lotto[su] = temp;
		}
		
		for(int i=0; i<6; i++) {
			if(i != 0) System.out.print(',');
			System.out.print(lotto[i]);
		}
		System.out.println("\t보너스번호:" + lotto[6]);
	}

}
