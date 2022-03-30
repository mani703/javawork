package com.bit.day11;

import java.io.*;
import java.util.Arrays;

public class Ex04 {
	
	public static void main(String[] args) {
		String path = "test01\\sub01";
		File file = new File(path);
		String parent = file.getParent();	// a\test01
		File before = file;
		
		while(true) {
			String path1 = before.getParent();	// a\test01
			try {
				before = new File(path1);
				before.mkdir();
				before = file;
				if(path1.equals(parent)) break;
			} catch(Exception e) {
				continue;
			}
		}
		file.mkdir();
		
//		String[] arr = path.split("\\\\");
//		System.out.println(Arrays.toString(arr));
//		String path1 = "";
//		for(int i=0; i<arr.length; i++) {
//			if(i != 0) path1 += "\\";
//			path1 += arr[i];
//			File before = new File(path1);
//			before.mkdir();
//		}
//		if(result) System.out.println("디렉토리 생성완료");
//		else System.out.println("디렉토리 생성실패");
	}
}
