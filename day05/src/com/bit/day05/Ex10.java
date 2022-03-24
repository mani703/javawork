package com.bit.day05;

public class Ex10 {

	public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			String msg=sc.nextLine();//한줄에 받는 내용
			System.out.println("입력받은 내용은 " +msg);
			
			System.out.println(args.length);
			for(int i=0;i<args.length;i++)
				System.out.println(args[i]);
				

	}

}
