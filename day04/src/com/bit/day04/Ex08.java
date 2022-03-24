package com.bit.day04;
import java.util.*;
/*학생 성적 관리 프로그램
 * 
 * */
public class Ex08 {
	int kor,eng,math,sum;//국어,수학,영어,총합
	double hap;//평균
	public Ex08(int a, int b, int c) {
		this.kor=a;
		this.eng=b;
		this.math=c;
		this.sum=(a+b+c);
		this.hap=(a+b+c)/(3.0);
	}
	public static void main(String[] args) {
		Ex08 student = new Ex08(84,93,70);
		student.print();
	}
	public void print() {
		System.out.println("-----------------");
		System.out.println("국어 :"+this.kor+" 영어 :"+this.eng+" 수학 :"+this.math);
		System.out.println("-----------------");
		System.out.println("합계 :"+this.sum);
		System.out.printf("평균 : %.2f\n",this.hap);//두자릿수 출력
		System.out.println("-----------------");
		System.out.println("학점 : "+grade(this.hap));
	}
	public static char grade(double a) {
		if(a>=90) return 'A';
		else if(a>=80) return 'B';
		else if(a>=70) return 'C';
		else if(a>=60) return 'D';
		else return 'F';
	}
}