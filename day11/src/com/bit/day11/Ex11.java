package com.bit.day11;

import java.io.*;

public class Ex11 {

	public static void main(String[] args) {
		String msg = "abc";
		for(int i=0; i<100000; i++) {
			msg += i;
		}
		byte[] buf = msg.getBytes();
		long before, after;
		System.out.println(buf.length);
		File file = new File("test08.txt");
		FileOutputStream fos = null;
		try {
			if (!file.exists())	file.createNewFile();
			fos = new FileOutputStream(file);
			
			before = System.currentTimeMillis();
//			for(int i=0; i<buf.length; i++) {
//				fos.write(buf[i]);
//			}
			fos.write(buf, 0, buf.length);
			fos.flush();
			fos.close();
			after = System.currentTimeMillis();
			System.out.println("작성완료" + (after-before) + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
