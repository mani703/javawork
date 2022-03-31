/**
 * 바이트 스트림은 1byte 체계
 * 모든 문자열을 다 받아놓고 한번에 변환해야 한다.
 */

package com.bit.day12;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		FileInputStream fis = null;
		
		byte[] buf = new byte[16];
		
		try {
			fis = new FileInputStream(file);

			for(int i=0 ; i<buf.length; i++) {
				buf[i] = (byte)fis.read();
			}
			
			fis.close();
			System.out.println(new String(buf));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
