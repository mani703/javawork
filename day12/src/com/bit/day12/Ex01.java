/**
 * 문자열 스트림은 2byte 체계
 * utf8은 3byte 체계
 * 자바는 유니코드 2byte 체계
 * ms949 2byte 체계
 * 문자열 스트림은 내용에 신경쓸 것
 * 바이트 스트림은 메모리에 신경쓸 것
 * 
 * 문자열 입력시 3byte -> 2byte -> 3byte
 * 
 * 유니코드는 인코딩을 해야하는데 기본적으로 하는 것이 utf8
 */

package com.bit.day12;

import java.io.*;

public class Ex01 {
	// 문자열 스트림 (2byte)
	public static void main(String[] args) {
		char ch = 97;
		File file = new File("test01.txt");
		FileWriter fw = null;
		
		try {
			if(!file.exists()) file.createNewFile();
			
			fw = new FileWriter(file);
			
			// int와 char는 오토 캐스팅으로 int로 가능
			fw.write('가');
			fw.write('나');	
			fw.write('다');	
			fw.write(' ');	
			fw.write('라');	
			fw.write('마');	
			
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
