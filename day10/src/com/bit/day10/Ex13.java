package com.bit.day10;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		// 절대 경로
		// 상대 경로
//		String path = "/javawork/day10/abc.txt";
//		String path = ".\\abc.txt";
		String path = "C:\\javawork\\day10\\test1";
//		path = ".\\abc.txt";
		File file1 = new File(path);
		System.out.println("존재하냐?" + file1.exists());
		System.out.println("디렉토리?" + file1.isDirectory());
		System.out.println("파일이냐?" + file1.isFile());
		System.out.println("경로1" + file1.getParent());
		System.out.println("경로2" + file1.getPath());
		System.out.println("절대경로1?" + file1.getAbsolutePath());
		try {
			System.out.println("절대경로2?" + file1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일명?" + file1.getName());
		System.out.println("r권한" + file1.canRead());
		System.out.println("w권한" + file1.canWrite());
		System.out.println("x권한" + file1.canExecute());
		System.out.println("사이즈?" + file1.length() + "byte");
		System.out.println("마지막수정일자?" + new Date(file1.lastModified()));
		String[] msgs = file1.list();
	}
}
