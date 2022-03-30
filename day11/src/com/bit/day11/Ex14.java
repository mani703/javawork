package com.bit.day11;

import java.io.*;
import java.util.Arrays;

public class Ex14 {

	public static void main(String[] args) {
		File file = new File("test08.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		long before, after;
		byte[] buf = new byte[1024];
		int cnt = 0;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			before = System.currentTimeMillis();
			while(true) {
				int su = bis.read(buf);
				if(su == -1) break;
				System.out.println(new String(buf, 0, su));
			}
			bis.close();
			fis.close();
			after = System.currentTimeMillis();
			System.out.println((after-before) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
