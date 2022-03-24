package com.bit.day07;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("호출전");
		func();
		System.out.println("호출후");
	}	
		
	public static void func() {
		try {
			int su = 1/0;
			System.out.println("문제없음");
			return;
		} catch(Exception e) {
			System.out.println("문제있음");
			return;
		} finally {
			System.out.println("항상실행");
		}
	}
}
