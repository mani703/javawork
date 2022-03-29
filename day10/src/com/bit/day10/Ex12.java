package com.bit.day10;

class Lec12 {
	public Box<? extends Pen> func() {
		return new Box<>();
	}
}

public class Ex12 extends Lec12 {
	
	@Override
	public Box<Pen> func(){
		return new Box<>();
	}

	public static void main(String[] args) {
		/**
		 * 아래 두가지 경우는 사용하지 말 것.
		 */
		Box<Pen> box1 = new Box();
		Box box2 = new Box<Pen>();
		
		
		Box<Pen> box3 = new Box<>();	// jdk버전 1.7~ 추론 타입
		Box<?> box4 = new Box<>();
//		box4.setSu(new BallPen());
	}

}
