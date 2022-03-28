package com.bit.day08;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 학생성적 관리프로그램(ver 0.3.0)
		// 1.입력 2.보기 [3.수정 4.삭제] 0.종료>
		// 학번 국어 영어 수학
		// ---------------
		// 입력에 제한이 없도록 제작하시오 (학생수의 제한없음)
		// 배열을 사용하시오 (동적할당)
		// 컬렉션 프레임워크 금지
		
		System.out.println("학생성적 관리프로그램(ver 0.3.0)");
		Scanner sc = new Scanner(System.in);
		int countOfStudent = 1;
		String[] student = new String[] {"학번\t|국어\t|영어\t|수학"};
		String[] subject = new String[] {"국어","수학","영어"};
		
		while(true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			String input = sc.next();						// 보기 입력 값  
			
			if(input.equals("0")) break;
			else if(input.equals("1")) {
				String[] temp = student;					// 기존 학생 점수를 받을 임시 배열
				student = new String[countOfStudent+1];		// 추가된 학생의 새로운 배열 
				
				for(int i=0; i<temp.length; i++) {
					student[i] = temp[i];					// 기존 배열 값을 새로운 배열로 값 복사
				}
				
				student[countOfStudent] = "" + countOfStudent + "\t";	
				for(int i=0; i<subject.length; i++) {
					System.out.print(countOfStudent + "학번 " + subject[i] + ">");
					student[countOfStudent] += "|" + sc.next() + "\t";	// 값 구분자와 학생 점수 추가
				}
				
				countOfStudent++;							// 새로운 입력 학생 추가에 대한 값 증가
			} else if(input.equals("2")) {
				System.out.println(student[0]);
				for(int i=1; i<student.length; i++)	{
					System.out.println(student[i]);			// 학생 배열 값에 대한 출력
				}
			} else if(input.equals("3")) {
				System.out.print("수정할 학번 선택>");
				String numberOfUpdate = sc.next();			// 수정할 학생의 번호 입력
				String temp = "";							// 새로 추가할 학생의 점수 String
				int indexOfUpdate = 0;
				
				for(int i=0; i<student.length; i++) {
					if(student[i].indexOf(numberOfUpdate) == 0) {
						indexOfUpdate = i;
					}
				}
				
				student[indexOfUpdate] = numberOfUpdate + "\t";
				for(int i=0; i<subject.length; i++) {
					System.out.print(numberOfUpdate + "학번" + subject[i] + ">");
					temp += "|" + sc.next() + "\t";
				}
				
				student[indexOfUpdate] += temp;				// 수정 된 값으로 변경

			} else if(input.equals("4")) {
				System.out.print("삭제할 학번 선택>");
				String numberOfDelete = sc.next();			// 삭제할 학번의 수
				String[] temp = student;					// 기존 값을 저장할 임시 배열
				student = new String[student.length-1];		// 삭제된 수의 새로운 학생 배열
				
				for(int i=0; i<temp.length; i++) {
					if(temp[i].indexOf(numberOfDelete) == 0) {
						int indexOfDelete = i;
						
						for(int j=0; j<indexOfDelete; j++) {
							student[j] = temp[j];
						}
						for(int j=indexOfDelete+1; j<temp.length; j++) {
							student[j-1] = temp[j];
						}
					}
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}

