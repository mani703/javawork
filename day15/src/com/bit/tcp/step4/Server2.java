package com.bit.tcp.step4;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Server2 extends Thread {
	Socket sock;
	static ArrayList<BufferedWriter> list = new ArrayList<BufferedWriter>();

	public Server2(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
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
			list.add(bw);
			
			while (true) {
				String msg = br.readLine();
				String[] tokens = msg.split(":");
				
				if(tokens[0].equals("message")) {
					for (int i = 0; i < list.size(); i++) {
						sendMessageToClient(i, tokens);
					}
				} else {
					int idx = Integer.parseInt(tokens[0]);
					sendMessageToClient(idx-1, tokens);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();
				if (osw != null)
					osw.close();
				if (isr != null)
					isr.close();
				if (is != null)
					is.close();
				if (os != null)
					os.close();
				if (sock != null)
					sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		ServerSocket serv = null;

		try {
			serv = new ServerSocket(5000);
			while (true) {
				Socket sock = serv.accept();
				Server2 me = new Server2(sock);
				me.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (serv != null)
					serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void sendMessageToClient(int i, String[] tokens) throws IOException {
			BufferedWriter bw = list.get(i);
			bw.write(tokens[1] + ":" + tokens[2]);
			bw.newLine();
			bw.flush();
	}
}
