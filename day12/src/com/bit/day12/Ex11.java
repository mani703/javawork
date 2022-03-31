package com.bit.day12;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File file = new File("test05.bin");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			dos.write(127);
			dos.writeInt(1234);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			dos.writeChar('@');
			dos.writeUTF("문자열작성");
			
			dos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
