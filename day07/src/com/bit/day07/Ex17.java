package com.bit.day07;

interface Inter{
	void func();
}

class Lec17{
	
	Inter func01() {
		Inter obj = new Inter(){
			public void func() {
				System.out.println("local run...");
			}
		};
		return obj;
	}
}

public class Ex17 {

	public static void main(String[] args) {
		Lec17 you = new Lec17();
		Inter obj = you.func01();
		obj.func();
	}

}
