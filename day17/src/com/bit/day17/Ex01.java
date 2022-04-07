package com.bit.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = "";
		System.out.println("학생성적관리 프로그램(ver 0.5.9)");
		File file = new File("data.txt");
		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			if (!file.exists())
				file.createNewFile();
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while (true) {
				String msg = br.readLine();
				if (msg == null)
					break;
				data += msg + "\r\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String input = null;
		while (true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			input = sc.nextLine();
			if (input.equals("0"))
				break;
			if (input.equals("1")) {
				String[] title = "학번\t이름\t국어\t영어\t수학\t평균".split("\t");
				for (int i = 0; i < title.length - 1; i++) {
					System.out.print(title[i] + ">");
					input = sc.nextLine();
					data += input + "\t";
				}
				data += "\r\n";
				/////
				try {
					fw = new FileWriter(file);
					bw = new BufferedWriter(fw);

					bw.write(data);
					bw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (bw != null)
							bw.close();
						if (fw != null)
							fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				/////
			} else if (input.equals("2")) {
				System.out.println("=============================================");
				System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
				System.out.println("=============================================");
				if (!data.isEmpty()) {
					String[] stus = data.split("\r\n");
					for (int i = 0; i < stus.length; i++) {
						String[] stu = stus[i].split("\t");
						int kor = Integer.parseInt(stu[2]);
						int eng = Integer.parseInt(stu[3]);
						int math = Integer.parseInt(stu[4]);
						double avg = (kor + eng + math) * 100 / 3 / 100.0;
						System.out.println(stus[i] + avg);
					}
				}
				System.out.println("=============================================");
			} else if (input.equals("3")) {
				System.out.print("수정할 학번>");
				input = sc.nextLine();
				input = "\r\n" + input + "\t";
				int startIdx = data.indexOf(input) + 2;
				int endIdx = startIdx + data.substring(startIdx).indexOf("\r") + 2;
			} else if (input.equals("4")) {
				System.out.print("삭제할 학번>");
				input = sc.nextLine();
				input = "\r\n" + input + "\t";
				int startIdx = data.indexOf(input) + 2;
				System.out.println(startIdx);
				int endIdx = startIdx + data.substring(startIdx).indexOf("\r") + 2;
				System.out.println(data.substring(startIdx));
				System.out.println(data.substring(startIdx).indexOf("\r"));
				data = data.replace(data.substring(startIdx, endIdx), "");
				/////
//				try {
//					fw = new FileWriter(file);
//					bw = new BufferedWriter(fw);
//
//					bw.write(data);
//					bw.flush();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} finally {
//					try {
//						if (bw != null)
//							bw.close();
//						if (fw != null)
//							fw.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
				/////
			}
		}
	}

}
