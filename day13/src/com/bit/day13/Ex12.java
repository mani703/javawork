package com.bit.day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램(ver 0.5.0)");
		String[] title = {"학번", "이름", "국어", "영어", "수학"};
		ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		int num = 0;
		
		while(true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			int input = Integer.parseInt(sc.nextLine());
			if(input == 0) break;
			if(input == 1) {
				num++;
				HashMap<String, String> map = new HashMap<String, String>();
				map.put(title[0], num+"");
				for(int i=1; i<title.length; i++) {
					System.out.print(title[i] + ">");
					map.put(title[i], sc.nextLine());
				}
				data.add(map);
			} else if(input == 2) {
				System.out.println("=====================================");
				System.out.println(title[0] + "\t" + title[1] + "\t" + title[2] + "\t" + title[3] + "\t" + title[4]);
				System.out.println("=====================================");
				for(int i=0; i<data.size(); i++) {
					HashMap<String, String> map = data.get(i);
					System.out.println(map.get(title[0]) + "\t" + map.get(title[1]) + "\t" + map.get(title[2]) + 
							"\t" + map.get(title[3]) + "\t" + map.get(title[4]));
				}
				System.out.println("=====================================");
			}
		}
	}
}
