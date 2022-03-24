package com.bit.day07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 입력을 받아서 주민번호 검사기
		// 주민번호입력>991231-1234567
		// 22세 남성입니다.

		// 주민번호입력>001231-4234567
		// 1세 여성입니다.

		// 주민번호입력>0012314234567
		// -를 생략하지 마시고 입력바랍니다.
		// 주민번호입력>001231-423456
		// 입력을 다시 확인하시고 입력하세요.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("주민번호입력>");
			String age = sc.nextLine();
			String gender1 = "남";
			if (age.indexOf('-') != 6) {
				System.out.println("-를 생략하지 마시고 입력바랍니다.");
				continue;
			}
			if (age.length() != 14) {
				System.out.println("입력을 다시 확인하시고 입력하세요.");
				continue;
			}

			Integer year = new Integer(age.substring(0, 2)) + 1900;
			Integer gender = new Integer(age.substring(7, 8));

			if (gender == 2 || gender == 4) gender1 = "여";

			if (gender == 3 || gender == 4) {
				year += 100;
				System.out.println(2022 - year +"세 " + gender1 + "성 입니다.");
			} else {
				System.out.println(2022 - year + "세 " + gender1 + "성 입니다.");
			}

		}

	}
}
