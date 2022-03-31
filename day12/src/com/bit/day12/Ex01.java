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
