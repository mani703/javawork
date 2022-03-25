package com.bit.day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream inn = System.in;
		java.util.Scanner sc;
		sc = new Scanner(inn);
		
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());

//		System.out.println(sc.nextInt() + 1);	// "1234 4321" : next + Int
//		System.out.println(sc.nextInt() + 1);
		
//		System.out.println(sc.next());	// "ABCD 1234\t@#$% : 개행, 띄어쓰기, 탭
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());	// "ABCD\nGGWR" : 개행만
//		}
	}

}
