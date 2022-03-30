package com.bit.day11;

import java.io.*;

public class Ex15 {

	public static void main(String[] args) {
		String msg = "abcdefg";
		File file = new File("test11.txt");
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			byte[] arr = msg.getBytes();
			
//			for(int i=0; i<arr.length; i++) {
//				bos.write(arr[i]);
//			}
			bos.write(arr);
//			bos.flush();
			
			bos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
