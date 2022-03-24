package com.bit.day06;

class Lec06{
	public int su1=2222;
	
	public Lec06(int a) {
		System.out.println("부모");
	}
	public void func01() {
		System.out.println("자식클래스의 기능");
	}
}
public class Ex06 extends Lec06{
	public int su1=1111;
	public Ex06() {
		super(1234);
		System.out.println(su1);
		System.out.println(super.su1);
		
	}
	public Ex06(int a) {
		this(a,0);//매개변수가 2개여서, Ex06(int a,int b)를 수행한다.
		System.out.println("한개");
	}
	public Ex06(int a,int b) {
		super(a);// 부모클래스가 먼저 선언되야되서, 이 위에 코드가 있으면 안됨.
		System.out.println("두개");
	}

	public static void main(String[] args) {
		Ex06 me =new Ex06();
		me.func01();

	}
	@Override
	public void func01() {
		super.func01();//부모클래스의 func01 가져오기
		System.out.println("자식 재정의");
	}
	

}
