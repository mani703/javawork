package com.bit.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test08.txt");
		FileInputStream fis = null;
		
		try {
			if(file.exists()) {
				fis = new FileInputStream(file);
			
				System.out.print(fis.read());
//				System.out.print(fis.read());
//				System.out.print(fis.read());
//				System.out.print(fis.read());
				
				fis.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
