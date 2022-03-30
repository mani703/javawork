package com.bit.day11;

import java.io.*;

public class Ex16 {

	public static void main(String[] args) {
		PrintStream consoleOut = System.out;
		consoleOut.println("시작");
		
		File file = new File("test12.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			if (!file.exists())	file.createNewFile();
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.print("abcd");
			ps.println();
			ps.println(1234);
			ps.println("!@#$");
			
			ps.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
