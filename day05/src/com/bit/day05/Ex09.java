package com.bit.day05;
import java.util.*;
/*1. 자바 정규표현식 조사해오기, 예시
  2. 학생 성적관리프로그램을 제작하는데 문자열을 이용할것이고
 * 학생의 성적을 입력받을것이다.
 * 
 * 결과
 * 학생 성적관리 프로그램(ver 0.2.0)
 * --------------------------
 * 1. 입력 2. 결과  0.종료 > 1
 * 1학번 국어>91
 * 1학번 영어>81
 * 1학번 수학>71
 * 1. 입력 2. 결과  0.종료 > 1
 * 2학번 국어>92
 * 2학번 영어>82
 * 2학번 수학>72
 * 1. 입력 2. 결과  0.종료 > 2
 * ---------------------
 * 학번 | 국어 | 영어 | 수학
 * 1  | 91 | 81 | 71
 * 2  | 92 | 82 | 72
 * ---------------------
 * 1. 입력 2. 결과  0.종료 > 0
 * 이용해주셔서 감사합니다.
 */
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num;//입력값
		String student = "";
		int number=1;
		while(true){
			System.out.print("1.입력  2.결과   0.종료 >");
			num=sc.nextLine();
			switch(num) {
			case "1"://입력
			{
				student+=number+ ",";
				System.out.print(number+"학번의 국어:");
				student+=sc.nextLine() + ",";
				System.out.print(number+"학번의 영어:");
				student+=sc.nextLine()+ ",";
				System.out.print(number+"학번의 수학:");
				student+=sc.nextLine()+ " ";
				number+=1;
				break;
			}
			case "2"://결과
			{
				String[] arr=student.split(" ");// 학생수만큼의 length가 나온다.
				System.out.println("------------------");
				System.out.println("학번\t|\t국어\t|\t수학\t|\t영어\t|");
				for(int i=0;i<arr.length;i++) {
					String[] arr2=arr[i].split(",");
					//학번,국어,수학,영어 총 4개로 나뉘어나옴
					for(int j=0;j<arr2.length;j++) {
						System.out.print(arr2[j]+"\t|\t");
					}
					System.out.println();
				}
				System.out.println("------------------");
				break;
			}
			case "0"://종료
				{
					System.out.println("이용해주셔서 감사합니다.");
					return;
				}
			}
		}
	}
}
