package com.bit.day05;

public final class Lec01 {
	public static int su1=1111; //public
	static int su2=2222; //default
	private static int su3=3333; //private
	protected int su4=4444;
	public void func01() {
		System.out.println(su3);//같은 클래스 내에서 private 접근 가능
	}
	protected Lec01() {}
	Lec01(int a){}
	private Lec01(int a, int b) {}

}
