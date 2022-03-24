package com.bit.day06;
//접근제한자
//상속제한

//public : 모두접근허용
//protected : default와 동일, 단 상속을 통한 접근은 허용
//default : 동일패키지까지만 접근 허용
//private : 클래스 내부에서만 접근 허용

class Lec07{
	public static int su1=1111; //public
	static int su2=2222; //default
	private static int su3=3333; //private

	public Lec07() {}
	public void setSu3(int su3) {
		Lec07.su3=su3;
	}
	public void func01() {
		System.out.println(su3);//같은 클래스 내에서 private 접근 가능
	}
}

public class Ex07 {

	public Ex07() {
		
	}
	Ex07(int a){
		
	}
	private Ex07(int a,int b) {
		
	}
	public static void main(String[] args) {
		//com.bit.day05.Lec01 you1=new com.bit.day05.Lec01();
		//com.bit.day05.Lec01 you2=new com.bit.day05.Lec01(111);
		//com.bit.day05.Lec01 you3=new com.bit.day05.Lec01(111,12);
		
		
		//Ex07 me=new Ex07();
		//System.out.println(com.bit.day05.Lec01.su1);//public
		//System.out.println(com.bit.day05.Lec01.su2);//default
		//System.out.println(com.bit.day05.Lec01.su3);//private
		//System.out.println(me.su4);//protected
		//System.out.println(Lec07.su3);private는 외부 클래스에서 사용 불가 x
		
	}

}
