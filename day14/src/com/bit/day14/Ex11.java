package com.bit.day14;

import java.net.*;
import java.io.*;

public class Ex11 {

	public static void main(String[] args) {
		File file = new File("naver.html");
		String path = "https://www.naver.com/";
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		URL url = null;
		try {
			url = new URL(path);
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			String msg = null;
			while((msg=br.readLine()) != null	) {
				pw.println(msg);
			}
			System.out.println("웹크롤링 완료...");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) pw.close();
				if(fw != null) fw.close();
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(is != null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
