package com.bit.day07;

public class Ex09 {

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
		
		System.out.println("주민번호 검사기(ver 0.2.0)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean boo = true;
		int age = 1;
		char gender = '남';
		int year = 0;
		while (boo) {
			System.out.println("주민번호 입력>");
			String input = sc.nextLine();

			String[] arr = input.split("-");
			if(arr.length != 2) {
				System.out.println("입력포맷을 다시 확인하세요");
				continue;
			}
			
			try {
				if(101 > Integer.parseInt(arr[0]) || Integer.parseInt(arr[0]) > 991231) {
					System.out.println("입력이 잘못되었습니다.");
				}
				if(1000000 > Integer.parseInt(arr[1]) || Integer.parseInt(arr[1]) > 5000000) {
					System.out.println("입력이 잘못되었습니다.");
				}
			} catch(NumberFormatException e) {
				System.out.println("정확한 숫자로 작성해주세요.");
			}
			
			
//			boolean digit = false;
//			for(int i=0; i<input.length(); i++) {
//				if(i == 6) continue;
//				if(!Character.isDigit(input.charAt(i))) digit = true;
//			}
//			
//			if (!input.contains("-")) {
//				System.out.println("-를 생략하지 마시고 입력 바랍니다.");
//				continue;
//			} else if(input.length() != 14) {
//				System.out.println("입력을 다시 확인하시고 입력하세요");
//				continue;
//			} else if(digit) {
//				System.out.println("입력을 다시 확인하시고 입력하세요");
//				continue;
//			}
			
			if (input.charAt(7) > '2') year = 1;
			age = 1 + 2022 - Integer.parseInt("19" + input.substring(0, 2)) - 100 * year;
			if (input.charAt(7) % 2 == '2' % 2) gender = '여';
			boo = false;
		}

		System.out.println(age + "세 " + gender + "성입니다.");
	
	}
}
