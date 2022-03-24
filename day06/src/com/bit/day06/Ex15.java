package com.bit.day06;

public class Ex15 implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		Object obj = new Object();
		Object obj2= new Object();
		System.out.println(obj==obj2);//false
		System.out.println(obj.equals(obj2));//false
		Ex15 me = new Ex15();
		Object obj4=me.clone();
		Ex15 you = (Ex15)obj4;
		//Object obj3=obj.clone();에러
		System.out.println(obj4.equals(you));//false
		//value값이 없는데 뭘 가지고 true가나오고 false가나오는지를 잘 모름.
		System.out.println(me.hashCode());//false
		System.out.println(you.hashCode());
		
		int[] arr= {1,2};
		Object obj5=arr.clone();
		int[] arr2=(int[])obj5;
		for(int i=0;i<arr2.length;i++) System.out.println(arr2[i]);
		System.out.println(obj5);
		
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}

}
