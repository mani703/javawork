package com.bit.day06;

public class Ex01 {
	
	public static String func01(int num,java.util.Scanner sc,String sub) {
		System.out.print(num+"학번 "+sub+">");
		return " |"+sc.nextLine();
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("학생 성적관리 프로그램(ver 0.2.0");
		int num=0;//학번
		String table="학번 | 국어 | 수학 | 영어 |";
		while(true) {
		System.out.print("1.입력  2.결과   0.종료 >");
		String input=sc.nextLine();
		if(input.equals("0"))break;
		else if(input.equals("1")) {
			table+="\n"+ (++num);//입력받을때마다 학번이 커짐
			/*
			System.out.print("학번의 국어:");
			table+=" |"+sc.nextLine();
			System.out.print("학번의 영어:");
			table+=" |"+sc.nextLine();
			System.out.print("학번의 수학:");
			table+=" |"+sc.nextLine();
			 */
			/*
			String[] subject= {"국어","수학","영어"};
			for(int i=0;i<3;i++) {
				System.out.print(num+"학번의 "+subject[i]+" 점수:");
				table+=" |"+sc.nextLine();
			}
			*/
			String[] subject= {"국어","수학","영어"};
			for(int i=0;i<3;i++) table+=func01(num,sc,subject[i]);
		}
		else if(input.equals("2")) {
			System.out.println("------------------");
			System.out.println(table);
			System.out.println("------------------");
		}
		}//while
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	
}
