package com.bit.day10;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex14 {
	
	public static void main(String[] args) {
		String path = "C:\\";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		File file = new File(path);
		String[] msgs = file.list();
		
		int fileOfCount = 0;
		int directoryOfCount = 0;
		
		for(int i=0; i<msgs.length; i++) {
			File temp = new File(msgs[i]);
			System.out.print(sdf.format(temp.lastModified()));
			
			if(temp.isDirectory()) {
				directoryOfCount++;
				System.out.print("\t<DIR>\t   ");
			} else {
				fileOfCount++;
				System.out.print("\t\t" + temp.length());
			}
			System.out.println("  " + temp.getName());
		}
		System.out.println("\t\t" + fileOfCount + "개 파일");
		System.out.println("\t\t" + directoryOfCount + "개 디렉터리");
	}
}
