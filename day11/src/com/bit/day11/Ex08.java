/**
 * 한쪽에서 연결하고 있으면 끊어주지 않는 이상 다른곳에서 연결 할 수 없다.
 */

package com.bit.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		File file = new File("test08.txt");
		try {
			if(!file.exists()) file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 바이트 스트림
		// 기본 단위: 1byte
		// InputStream: 읽기
		// OutputStream: 쓰기
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			
			fos.write(256);	// 1byte 씩 작성
//			fos.write(66);
//			fos.write(67);
//			fos.write(68);
			
			fos.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
