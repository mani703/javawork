package com.bit.day06;

class Lec02{
	public static int su1=1111;
	public int su2=2222;
	
	public static void func01() {
		System.out.println("부모 f1...");
		//System.out.println(su3);
	}
	public void func02() {
		System.out.println("부모 f2...");
	}
}

public class Ex02 extends Lec02{//Ex02는 부모클래스인 Lec02를 상속받는다.

	public static int su3=3333;
	public static void main(String[] args) {
	//부모클래스의 static 변수는 바로 호출이 가능함
	System.out.println(Lec02.su1);
	Lec02.func01();//static함수는 바로 호출이 가능함.
	System.out.println("---------------------");
	
	//non-static은 객체를 생성해서 호출해야함.
	Lec02 you = new Lec02();
	System.out.println(you.su2);
	you.func02();;
	
	// 자식 클래스에 아무것도 선언되어있지 않아도, 부모클래스 변수나 함수를 사용할 수 있다.
	Ex02 me = new Ex02(); 
	System.out.println(me.su2);
	me.func02();
	
	Lec02 we = new Ex02(); 
	System.out.println(we.su2);
	we.func02();
	}

}
