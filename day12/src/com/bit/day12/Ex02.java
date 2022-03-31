package com.bit.day12;

import java.io.*;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
