package com.bit.stu01;

import java.util.*;
import java.io.*;

class Student implements Serializable {
	int num;
	String name;
	int kor, eng, math;
}

public class Ex01 extends Thread {
	static ArrayList<Student> list = new ArrayList<>();
	File file = new File("data.bin");
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(20*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			fileWrite();
		}
	}
	
	public void fileRead() {
		if(!file.exists()) {
			fileWrite();
		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			list = (ArrayList<Student>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileWrite() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			if (!file.exists())	{
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(oos != null) oos.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();
		me.fileRead();
		me.setDaemon(true);
		me.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램(ver 0.6.0)");
		String input = null;

		while (true) {
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			input = sc.nextLine();

			if (input.equals("0"))
				break;
			if (input.equals("1")) {
				Student stu = new Student();

				System.out.print("학번>");
				input = sc.nextLine();
				stu.num = Integer.parseInt(input);

				System.out.print("이름>");
				input = sc.nextLine();
				stu.name = input;

				System.out.print("국어>");
				input = sc.nextLine();
				stu.kor = Integer.parseInt(input);

				System.out.print("영어>");
				input = sc.nextLine();
				stu.eng = Integer.parseInt(input);

				System.out.print("수학>");
				input = sc.nextLine();
				stu.math = Integer.parseInt(input);

				list.add(stu);
			}
			if (input.equals("2")) {
				System.out.println("-----------------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
				System.out.println("-----------------------------------------------");
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor + "\t" + stu.eng + "\t" + stu.math
							+ "\t" + (stu.kor + stu.eng + stu.math) * 100 / 3 / 100.0);
				}
				System.out.println("-----------------------------------------------");
			}
		}
	}

}
