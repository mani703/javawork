package com.bit.day06;

interface Inter01{
	public final static int su1=1111;
	final static int su2=2222;
	static int su3=3333;
	int su4=4444;
	
	public abstract void func01();//추상메서드
	public void func02();
	void func03();
}
interface Inter02 extends Inter01,Inter03{}
interface Inter03 {}
public class Ex14 extends Object implements Inter02{
	public static void main(String[] args) {
	System.out.println(Inter01.su4);//
	Object me=new Ex14();
	Ex14 we=new Ex14();
	}
	@Override
	public void func01() {
		
	}
	@Override
	public void func02() {
		
		
	}
	@Override
	public void func03() {
		
		
	}

}
