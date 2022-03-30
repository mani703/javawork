package com.bit.day11;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		String path = "C:\\javawork\\day11";
//		path = args[0];
		path = "./";
		File root = new File(path);
		
		if(root.exists() && root.isDirectory()) {
			String[] list = root.list();
			String[] list2 = null;
			
			if(root.getParent() == null) {
				list2 = list;
			} else {
				list2 = new String[list.length+2];
				list2[0] = ".";
				list2[1] = "..";
				System.arraycopy(list, 0, list2, 2, list.length);
			}
			
			for(int i=0; i<list2.length; i++) {
				File file = new File(list2[i]);
				Date date = new Date(file.lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				String msg = sdf.format(date);
				
				System.out.print(msg + "\t");
				if(file.isDirectory()) {
					System.out.print("<DIR>\t\t");
				} else {
					System.out.print("\t" + file.length() + "\t");
				}
				System.out.println(list2[i]);
			}
		} else {
			System.out.println("볼륨에는 이름이 없습니다.");
			if(root.exists()) {
				Date date = new Date(root.lastModified());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				String msg = sdf.format(date);
				
				System.out.print(msg + "\t");
				if(root.isDirectory()) {
					System.out.print("<DIR>\t\t");
				} else {
					System.out.print("\t" + root.length() + "\t");
				}
				System.out.println(root.getName());
			}
		}
	}
}
