package com.bit.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test08.txt");
		FileOutputStream fos = null;
		java.io.OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			
			osw.write("문자열 잘 작성됩니다...");
			
			osw.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
