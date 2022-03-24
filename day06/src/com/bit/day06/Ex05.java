package com.bit.day06;

class Lec05{
	public void func01() {
		System.out.println("부모클래스의 기능");
	}
}

public class Ex05 extends Lec05{

	public static void main(String[] args) {
	Lec05 you1= new Lec05();
	you1.func01();
	System.out.println("---------------------");
	Ex05 me = new Ex05();
	me.func01();
	me.func02();
	System.out.println("---------------------");
	//다형성
	Lec05 you2=new Ex05();
	you2.func01();
	//you2.func02();오류발생
	//부모클래스로 선언하여 자식클래스로 초기화 해주면 자식클래스에 있는거 말고 부모클래스에있는거만 사용가능하다.
	
	Ex05 me2=(Ex05)you2;
	me.func02();
	
	
	}
	public void func02() {
		System.out.println("자식이 추가 정의한 코드...");
	}

}
