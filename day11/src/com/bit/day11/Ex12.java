package com.bit.day11;

import java.io.*;

public class Ex12 {

	public static void main(String[] args) {
		File file = new File("test11.txt");
		long before, after;
		FileInputStream fis = null;
		byte[] buf = new byte[1024];
		
		try {
			fis = new FileInputStream(file);
			before = System.currentTimeMillis();
			
//			while(true) {
//				int su = fis.read();
//				if(su == -1) break;
//			}
			while(true) {
				int su = fis.read(buf);
				if(su == -1) break;
				System.out.println(new String(buf, 0, su));
			}
			
			fis.close();
			after = System.currentTimeMillis();
//			System.out.println("" + (after-before) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
