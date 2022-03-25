package com.bit.day08;

import java.util.Arrays;

class Ball {
	final int su;
	boolean check;
	String color;

	public Ball(int su) {
		this.su = su;
		this.check = false;
		switch (su / 10) {
		case 0:
			color = "노랑";
			break;
		case 1:
			color = "파랑";
			break;
		case 2:
			color = "빨강";
			break;
		case 3:
			color = "초록";
			break;
		default:
			color = "회";
			break;
		}
	}
}

public class Ex14 {

	public static void main(String[] args) {
		// 로또 번호생성기(ver 0.1.0) 1 ~ 45
		// 4, 44, 23, 33, 12, 2
		// 2, 4, 12, 23, 33, 44 + 보너스 번호
		//////////////////////////////////
		// Arrays.sort() 제외
		//////////////////////////////////
		// 2. 객체지향
		//////////////////////////////////

		int limit = 45;
		Ball[] box = new Ball[limit];
		String[] note = new String[6];

		for (int i = 0; i < box.length; i++) {
			box[i] = new Ball(i + 1);
		}

		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * limit);
			Ball ball = box[ran];
			if (ball.check) {
				// 뽑았던 공
				i--;
			} else {
				// 안뽑았던 공
				ball.check = true;
				note[i] = ball.color + "색 공 " + ball.su;
			}
		}
		System.out.println(Arrays.toString(note));
	}

}
