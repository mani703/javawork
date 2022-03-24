package com.bit.day06;


abstract class Lec12{//추상클래스 : 추상메서들를 0개이상 갖는 클래스
	int su=11111;
	Lec12(int a){}
	void func01() {System.out.println("부모에서 구현한 기능1");}
	//abstract void func02(); //추상메서드 : 메서드의 선언만 가진다.
}
public class Ex12 extends Lec12 {
	Ex12(){super(12);}
//상속받을때, 하위 또한 추상클래스가 되거나
	// 부모클래스의 추상메서드들을 오버라이딩한다.
	public static void main(String[] args) {
		Lec12 me = new Ex12();
		me.func01();
		//me.func02();
		//me.func03();
	}
	void func01() {}
	
	void func02() {
		System.out.println("자식에서 부여한 기능2");
	}
	void func03() {
		System.out.println("자식에서 부여한 기능3");
	}
}