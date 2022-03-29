package com.bit.day10;

import java.util.*;

class Ball implements java.lang.Comparable{
	int su;
	public Ball(int su) {
		this.su = su;
	}
	
	@Override
	public int compareTo(Object obj) {
//		return this.su - ((Ball)obj).su;
//		return ((Ball)obj).su - this.su;
		return 1;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		// TreeSet 오름차순(양수) 내림차순(음수) 결정
		Comparator comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return -1;
			}
			
		};
		
		Set lotto = new TreeSet(comp);
		Random ran = new Random();
		
		int su = 1;
		while(lotto.size() != 6) {
			lotto.add(new Ball(su++));
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()) {
			Ball ball = (Ball)ite.next();
			System.out.print(ball.su + " ");
		}
	}

}
