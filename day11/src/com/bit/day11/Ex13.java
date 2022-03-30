package com.bit.day11;

import java.io.*;

public class Ex13 {

	public static void main(String[] args) {
		File origin = new File("C:\\javawork\\origin.jfif");
		File copy = new File("./copy.jfif");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] buf = new byte[1024];

		try {
			if (!copy.exists()) copy.createNewFile();
			fis = new FileInputStream(origin);
			fos = new FileOutputStream(copy);
			
			while(true) {
				int cnt = fis.read(buf);
				if(cnt == -1) break;
				fos.write(buf, 0, cnt);
			}
			
			fos.close();
			fis.close();
			System.out.println("복사끝");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
