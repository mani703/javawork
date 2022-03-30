/**
 * 한쪽에서 연결하고 있으면 끊어주지 않는 이상 다른곳에서 연결 할 수 없다.
 */

package com.bit.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

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
		String msg = "abcd";
		byte[] arr = msg.getBytes();
		System.out.println(Arrays.toString(arr));
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);

			for(int i=0; i<arr.length; i++) {
				fos.write(arr[i]);	// 1byte 씩 작성
			}
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
