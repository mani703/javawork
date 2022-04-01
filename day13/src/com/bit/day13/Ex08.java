package com.bit.day13;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex08 {

	public static void main(String[] args) {
		String path = "C:\\javawork\\day13";
		path = ".";
		File file = new File(path);

		if(file.exists()) {
			try {
				path = file.getCanonicalPath();
				file = new File(path);
				if(file.isDirectory()) {
					String[] arr = file.list();
					for(int i=0; i<arr.length; i++) {
						fileInfo(new File(file.getPath() + "\\" + arr[i]));
					}
				} else {
					fileInfo(file);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("잘못된 경로");
		}
	}
	
	// 파일의 정보를 출력(yyyy-MM-dd a.p. hh:mm ["<DIR>"] [length] name
	public static void fileInfo(File temp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String date = sdf.format(new Date(temp.lastModified()));
		System.out.print(date + "\t");
		if(temp.isDirectory()) {
			System.out.print("<DIR>\t\t");
		} else {
			System.out.print("\t" + temp.length() + "\t");
		}
		System.out.println(temp.getName());
	}

}
