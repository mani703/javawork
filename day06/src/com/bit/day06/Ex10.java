package com.bit.day06;
//메서드 오버라이드에서는 접근제한자가 같거나 보다 공개되는 방향으로는 가능하다.
class Lec10{
	void func01() {
		
	}
}

public class Ex10 extends Lec10{

	public static void main(String[] args) {
		Ex10 me = new Ex10();
		me.func01();

	}
	@Override
	 public void func01() {
		System.out.println("테스트");
	}

}
