package com.bit.day04;
/*학생 성적 관리 프로그램  */
public class Ex008 {
	public static void main(String[] args) {
		String title="학생 성적 관리 프로그램(ver 0.1.0)";
		System.out.println(title);
		int kor=84, eng=93, math=70;
		double avg=(kor+eng+math)*100/3/100.0;
		System.out.println("====================");
		System.out.println("국어 :"+kor+"\t영어 :"+eng+ "\t수학 :"+math);
		System.out.println("====================");
		System.out.println("합계 : "+(kor+eng+math));
		System.out.println("평균 : "+avg); 
		System.out.println("====================");
		
		/*
		 * 100~90 A -> 9
		 * 89~80 B -> 8
		 * 79~70 C -> 7
		 * 69~60 D -> 6
		 * default F
		 * */
		
		switch((kor+math+eng)/30) {
		case 10: case 9:
			System.out.println("학점:A");
			break;
		case 8:
			System.out.println("학점:B"+(kor+math+eng)/30);
			break;
		case 7:
			System.out.println("학점:C");
			break;
		case 6:
			System.out.println("학점:D");
			break;
		default:
			System.out.println("학점:F");
			break;
		}
		
		
		
		
		/*
		switch((int)avg/10)
		{case 9:
			System.out.println("학점:A");
			break;
		case 8:
			System.out.println("학점:B");
			break;
		case 7:
			System.out.println("학점:C");
			break;
		case 6:
			System.out.println("학점:D");
			break;
		default:
			System.out.println("학점:F");
			break;
		}
		
		if(avg>=90) System.out.println("학점:A");
		else if(avg>=80) System.out.println("학점:B");
		else if(avg>=70) System.out.println("학점:C");
		else if(avg>=60) System.out.println("학점:D");
		else System.out.println("학점:F");
		
		*/
		System.out.println("이용해주셔서 감사합니다");
	}
	
}