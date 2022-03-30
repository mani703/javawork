package com.bit.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test08.txt");
		FileInputStream fis = null;
		byte[] arr = new byte[(int)file.length()];
		
		try {
			if(file.exists()) {
				fis = new FileInputStream(file);
			
//				for(int i=0; i<arr.length; i++) {
//					arr[i] = (byte)fis.read();
//				}
				
				while(true) {
					int su = fis.read();
					if(su == -1) break;
					System.out.print(su);
				}
				
				System.out.println(new String(arr)+"!");
				fis.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
