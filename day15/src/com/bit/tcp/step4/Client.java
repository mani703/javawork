package com.bit.tcp.step4;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client extends Frame implements Runnable {
	static TextArea ta;
	static BufferedReader br = null;
	
	public Client() {
		ta = new TextArea();
		add(ta);
		setSize(400, 500);
		setLocation(100, 100);
		setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String msg = ta.getText() + "\n" + br.readLine();
				ta.setText(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client me = new Client();
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			sock = new Socket("127.0.0.1" , 5000);
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			Thread thr = new Thread(me);
			thr.start();
			
			while(true) {
				String msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(br != null) br.close();
				if(osw != null) osw.close();
				if(isr != null) isr.close();
				if(os != null) os.close();
				if(is != null) is.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
