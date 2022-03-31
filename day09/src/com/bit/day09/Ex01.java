package com.bit.day09;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		String[] msg = { "국어", "영어", "수학" };
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.3.0)");
		int input = 0;
		BitArray list = new BitArray();

		while (true) {
			System.out.print("1.입력  2.보기  [3.수정  4.삭제 ]0.종료 >");

			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (java.lang.NumberFormatException e) {
				continue;
			}
			if (input == 0) {
				break;
			} else if (input == 1) {
				int[] stu = new int[msg.length];
				for (int i = 0; i < msg.length; i++) {
					func01(msg[i], i, sc, stu);
				}
				list.add(stu);
				
			} else if (input == 2) {
				System.out.println("--------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("--------------------------------");
				for (int i = 0; i < list.size(); i++) {
					int[] stu = (int[]) list.get(i);
					System.out.println(i + 1 + "\t" + stu[0] + "\t" + stu[1] + "\t" + stu[2] + "\t");
				}
				System.out.println("--------------------------------");
				
			} else if (input == 3) {
				System.out.print("수정할 학번>");
				int num = Integer.parseInt(sc.nextLine());
				if (num <= list.size()) {

					int[] stu = new int[msg.length];
					for (int i = 0; i < stu.length; i++) {
						func01(msg[i], i, sc, stu);
					}
					list.set(num - 1, (Object) stu);
				}
				
			} else if (input == 4) {
				System.out.print("삭제할 학번>");
				input = Integer.parseInt(sc.nextLine());
				list.remove(input - 1);
			}
		}
		System.out.println("이용해주셔서 감사합니다.");

	}

	public static void func01(String msg, int i, Scanner sc, int[] stu) {
		int input = 0;
		while (true) {
			System.out.print(msg + ">");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (java.lang.NumberFormatException e) {
				continue;
			}
			if (input <= 100 && input >= 0)
				break;
		}
		stu[i] = input;
	}
}
