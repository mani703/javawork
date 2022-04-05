package com.bit.tcp.step3;

import java.net.*;
import java.io.*;

public class Server extends Thread {
	Socket sock;
	
	public Server(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				bw.write(sock.getInetAddress().getHostAddress() + ":" + msg);
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
				if(is != null) is.close();
				if(os != null) os.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ServerSocket serve = null;
		
		try {
			serve = new ServerSocket(5000);
			while(true) {
				Socket sock = serve.accept();
				System.out.println(sock.getInetAddress().getHostAddress());
				Server thr = new Server(sock);
//				thr.sock = sock;
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serve != null) serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
