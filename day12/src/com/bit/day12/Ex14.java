package com.bit.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex14 {

	public static void main(String[] args) {
		File file = new File("test06.bin");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.write(127);
			oos.writeInt(1234);
			
			//data스트림과 중복
			ArrayList list = new ArrayList();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			oos.writeObject(list);
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
