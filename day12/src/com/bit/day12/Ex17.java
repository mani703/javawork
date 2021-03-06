package com.bit.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex17 {

	public static void main(String[] args) {
		File file = new File("test07.bin");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Lec16 obj = (Lec16)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(obj.su2);
			obj.func();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
