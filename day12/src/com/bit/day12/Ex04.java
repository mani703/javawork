package com.bit.day12;

import java.io.*;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		File copy = new File("test02.txt");
		FileReader fr = null;
		FileWriter fw = null;
		char[] cbuf = new char[10];
		
		try {
			if(!copy.exists()) copy.createNewFile();
			fw = new FileWriter(copy);
			fr = new FileReader(file);
			
			while(true) {
				int su = fr.read(cbuf, 0, 2);
				if(su == -1) break;
				System.out.println(Arrays.toString(cbuf));
				fw.write(cbuf, 0, su);
			}
			
			fw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
