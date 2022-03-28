package com.bit.day09;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 학생성적 관리프로그램(ver 0.3.0)
		// 1.입력 2.보기 [3.수정 4.삭제] 0.종료>
		// 학번 국어 영어 수학
		// ---------------
		// 입력에 제한이 없도록 제작하시오 (학생수의 제한없음)
		// 배열을 사용하시오 (동적할당)
		// 컬렉션 프레임워크 금지
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적 관리프로그램(ver 0.3.0)");
		int input = 0;
		String[] msg = {"국어", "영어", "수학"};
		BitArray list = new BitArray();
		while(true) {
			System.out.print("1.입력 2.보기 [3.수정 4.삭제] 0.종료>");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				continue;
			}
			if(input == 0) {
				break;
			} else if(input == 1) {
				int[] stu = new int[msg.length];
				for(int i=0; i<3; i++) {
					func01(msg[i], i, sc, stu);
				}
				list.add(stu);
			} else if(input == 2) {
				System.out.println("----------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("----------------------------");
				for(int i=0; i<list.size(); i++) {
					int[] stu = (int[])list.get(i);
					System.out.println(i+1 + "\t" + stu[0] + "\t" + stu[1] + "\t" + stu[2]);
				}
				System.out.println("----------------------------");
			} else if(input == 3) {
				System.out.print("수정할 학번>");
				int num = Integer.parseInt(sc.nextLine());
				if(num <= list.size()) {
					int[] stu = new int[msg.length];
					for(int i=0; i<stu.length; i++) {
						func01(msg[i], i, sc, stu);
					}
					list.set(num-1, stu);
				}
			} else if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = Integer.parseInt(sc.nextLine());
				list.remove(num-1);
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	public static void func01(String msg, int i, Scanner sc, int[] stu) {
		int input = 0;
		while(true){
			System.out.print(msg + ">");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e) {
				continue;
			}
			if(input <= 100) break;
		}
		stu[i] = input;
	}
}
