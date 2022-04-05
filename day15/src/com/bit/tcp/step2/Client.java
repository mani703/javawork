package com.bit.tcp.step2;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter isw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			sock = new Socket("192.168.128.138", 5002);
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			isw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(isw);
			
			while(true) {
				System.out.print(">");
				String msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				msg = br.readLine();
				System.out.println(msg);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(bw != null) bw.close();
				if(isr != null) isr.close();
				if(isw != null) isw.close();
				if(is != null) is.close();
				if(os != null) os.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
