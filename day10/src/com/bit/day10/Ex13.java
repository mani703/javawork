package com.bit.day10;

import java.io.*;

public class Ex13 {

	public static void main(String[] args) {
		// 절대 경로
		// 상대 경로
		String path = "C:\\javawork\\day10\\abc.txt";
//		String path = "/javawork/day10/abc.txt";
//		String path = ".\\abc.txt";
		File file1 = new File(path);
		System.out.println("존재하냐?" + file1.exists());
		System.out.println("디렉토리?" + file1.isDirectory());
		System.out.println("파일이냐?" + file1.isFile());
	}

}
