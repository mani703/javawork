package com.bit.day07;

import com.bit.day07.Outter15.Inner15;

class Outter14{
	static int su3 = 3333;
	int su4 = 4444;
	
	static class Inner14{
		static int su1 = 1111;
		int su2 = 2222;
		
		Inner14() {
			
		}
		
		static void func1() {
			System.out.println(su3);
			Outter14 outt = new Outter14();
			System.out.println(outt.su4);
			func03();
			outt.func04();
		}
		
		void func2() {
			System.out.println(su3);
			Outter14 outt = new Outter14();
			System.out.println(outt.su4);
		}
	}
	
	Outter14() {
		
	}
	
	static void func03() {
		System.out.println(Inner14.su1);
		Inner14 inn = new Inner14();
		System.out.println(inn.su2);
	}
	void func04() {
		System.out.println(Inner14.su1);
		Inner14 inn = new Inner14();
		System.out.println(inn.su2);
	}
}

public class Ex14 {
	// 클래스명$내부클래스.class

	public static void main(String[] args) {
		System.out.println(Outter14.su3);
		Outter14 outt = new Outter14();
		System.out.println(outt.su4);
		System.out.println(Outter14.Inner14.su1);
		Outter14.Inner14 inn = new Outter14.Inner14();
		System.out.println(inn.su2);
	}

}
