package com.bit.tcp.step4;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server extends Thread {
	Socket sock;
	static ArrayList<BufferedWriter> list = new ArrayList<BufferedWriter>();

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
			list.add(bw);
			while (true) {
				String msg = br.readLine();
				for (int i = 0; i < list.size(); i++) {
					bw = list.get(i);
					bw.write(msg);
					bw.newLine();
					bw.flush();
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
				Server me = new Server(sock);
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

}
