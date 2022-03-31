package com.bit.day12;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File("test04.txt");

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			if (!file.exists()) file.createNewFile();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("첫째줄");
			bw.newLine();		// 윈도우에서 실행했기 때문에 \r\n
			bw.write("두번째줄");
			bw.newLine();
			bw.write("세번째줄");
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
