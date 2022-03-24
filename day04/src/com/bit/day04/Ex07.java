package com.bit.day04;

public class Ex07 {
	public int speed;
	public String name;
	public void speedUp() {
		speed+=10;
		System.out.println(name+"의 현재 속도는 "+speed+"km 입니다.");
	}
	public void speedDown() {
		speed-=10;
		System.out.println(name+"의 현재 속도는 "+speed+"km 입니다.");
	}
	
	public static void main(String[] args) {
		Ex07 myCar1 = new Ex07();
		Ex07 myCar2 = new Ex07();
		myCar1.name="붕붕쓰";
		myCar2.name="차차쓰";
		System.out.println(myCar1.name+"의 현재 속도는 "+myCar1.speed+"km 입니다.");
		myCar1.speedUp();
		myCar1.speedUp();
		myCar2.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedDown();
		myCar1.speedDown();
		myCar1.speedDown();
		
	}

}
