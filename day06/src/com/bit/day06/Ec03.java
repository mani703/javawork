package com.bit.day06;

class Lec03{
	public int su1=1111;
	public void func01() {
		System.out.println("부모클래스의기능");
	}
}


public class Ec03 extends Lec03{
	//이건 오버라이드 x
	//public int su1=1000;
	public static void main(String[] args) {
		Ec03 me = new Ec03();
		System.out.println(me.su1);
		me.func01();//자식 클래스func호출
		
	}
	//메서드 오버라이드
	//부모클래스의 메서드와 구조가 동일
	public void func01() {
		System.out.println("자식클래스의 기능");
	}

}
