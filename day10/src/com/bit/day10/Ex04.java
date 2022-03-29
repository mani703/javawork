package com.bit.day10;

import java.util.*;

class Ball implements java.lang.Comparable{
	int su;
	static int num = 1;
	int num2;
	public Ball(int su) {
		this.su = su;
		num2 = num++;
	}
	
	@Override
	public int compareTo(Object obj) {
//		return this.su - ((Ball)obj).su;
		return ((Ball)obj).su - this.su;
//		return 1;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		// TreeSet 오름차순(양수) 내림차순(음수) 결정
		Comparator<Ball> comp = new Comparator<Ball>() {

			@Override
			public int compare(Ball after, Ball before) {
				return +1;//after.su - before.su;
			}
			
		};
		
		Set lotto = new TreeSet();
		Random ran = new Random();
		
		while(lotto.size() != 6) {
			lotto.add(new Ball(ran.nextInt(6)+1));
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()) {
			Ball ball = (Ball)ite.next();
			System.out.print(ball.su + " ");
			System.out.println(ball.num2 + " ");
		}
	}

}
