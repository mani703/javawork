package com.bit.day12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		File file = new File("test03.txt");
		FileInputStream fis = null;
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bais = null;
		
		try {
			fis = new FileInputStream(file);
			baos = new ByteArrayOutputStream();
			int su = -1;
			
			while((su=fis.read()) != -1) {
				baos.write(su);
			}
			bais = new ByteArrayInputStream(baos.toByteArray());
			while(true){
				int su2 = bais.read();
				if(su2 == -1) break;
				System.out.println(su2);
			}
			
			bais.close();
			baos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
