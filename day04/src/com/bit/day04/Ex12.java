package com.bit.day04;

public class Ex12 {

	public int su=1111;
	public Ex12(int su) {
		this.su=su;
	}
	public static void main(String[] args) {
		Ex12 me = new Ex12(2341);
		me.su++;
		System.out.println("main su = " + me.su);
		me.func01().func01().func02(4444);
	}

	public Ex12 func01() {
		int su=2222;
		Ex12 me=this;
		System.out.println("1func01 su = "+ this.su);
		System.out.println("1-1func01 su = "+ me.su);
		System.out.println("2func01 su = "+ su);
		System.out.println(me.equals(this));
		return this;
	}
	public void func02(int a ) {
		this.su=a;
	}
}
