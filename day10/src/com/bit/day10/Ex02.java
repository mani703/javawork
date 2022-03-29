package com.bit.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.2.0)
		
		Random ran = new Random();
		Set lotto = new HashSet();
		
		while(lotto.size() != 6){
			lotto.add(ran.nextInt(45)+1);			
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next() + "\t");
		}
	}

}
