package com.bit.day12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Lec16 implements Serializable {

	private static final long serialVersionUID = 2L;
	private int su = 1111;
	transient int su2 = 2222;	// 직렬화 대상에서 제외 -> 디폴트 값으로 출력
	
	public void func() {
		System.out.println("바꾼기능 실행");
	}
	
	public int getSu() {
		return su;
	}
} 

public class Ex16 {

	public static void main(String[] args) {
		File file = new File("test07.bin");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Lec16());
			
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
