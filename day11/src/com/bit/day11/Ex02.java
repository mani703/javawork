package com.bit.day11;

/**
 * io는 항상 Exception을 수반한다.
 * try catch 반드시 요구
 * 파일이든 디렉터리든 동일 파일명은 생성이 안된다.
 */

import java.io.*;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test01");
		if(!file.exists()) {
			try {
				boolean result = file.createNewFile();
				if(result) System.out.println("파일 생성 완료");
				else System.out.println("생성 실패");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("동일 파일명이 존재합니다");
		}
	
	}

}
