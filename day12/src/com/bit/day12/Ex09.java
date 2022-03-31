package com.bit.day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test04.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

//			while(true) {
//				String msg = br.readLine();
//				if(msg == null) break;
//				System.out.println(msg);
//			}
			String msg = null;
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
			
			br.close();
			fr.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
