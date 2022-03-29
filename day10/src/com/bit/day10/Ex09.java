/**
 * 객체 생성 시점에 타입을 지정한다
 */

package com.bit.day10;

class Pen {
	void drow() {
		System.out.println("선을 긋는다");
	}
}

class Pencil extends Pen {
	
	void drow() {
		System.out.println("지워질 수 있는 선을 긋는다");
	}
}

class BallPen extends Pen {
	
	void drow() {
		System.out.println("안지워지는 선을 긋는다");
	}
}

// T, K, V, E (type, key, value, element)
class Box<T> {
	T su;
	
	void setSu(T su) {
		this.su = su;
	}
	
	T getSu() {
		return su;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Box<Pen> box = new Box<Pen>();
		Pencil myPen1 = new Pencil();
		BallPen myPen2 = new BallPen();
		box.setSu(myPen2);
		
		Pen obj = box.getSu();
		obj.drow();
	}

}
