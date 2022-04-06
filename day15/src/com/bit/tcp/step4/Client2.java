package com.bit.tcp.step4;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client2 extends Frame implements Runnable {
	static TextArea ta;
	static BufferedReader br = null;

	public Client2() {
		ta = new TextArea();
		add(ta);
		setSize(400, 500);
		setLocation(100, 100);
		setVisible(true);
	}

	@Override
	public void run() {
		try {
			String msg = br.readLine();
			String[] tokens = msg.split(":");
			while (true) {
				if(ta.getText() != null) {
					ta.setText(ta.getText() + "\n" + tokens[1] + ":" + tokens[0]);
			} else {
				ta.setText(tokens[1] + ":" + tokens[0]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client2 me = new Client2();
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			sock = new Socket("127.0.0.1", 5000);
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			System.out.print("이름을 입력하세요>");
			String name = sc.nextLine();

			while (true) {
				
				System.out.println("옵션을 선택하세요");
				System.out.print("1.메시지 2.귓속말 >");
				String input = sc.nextLine();

				if (input.equals("1")) {
					Thread thr = new Thread(me);
					thr.start();

					while(true) {
						System.out.print("message:");
						String msg = sc.nextLine();
						if(msg.equals("exit")) break;
						bw.write("message:" + msg + ":" + name);
						bw.newLine();
						bw.flush();
					}
				} else if (input.equals("2")) {
					Thread thr = new Thread(me);
					thr.start();
					
					System.out.print("상대를 입력하세요>");
					String seg = sc.nextLine();

					while (true) {
						System.out.print("message:");
						String msg = sc.nextLine();
						if(msg.equals("exit")) break;
						bw.write(seg + ":" + msg + ":" + name);
						bw.newLine();
						bw.flush();
					}
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
				if (os != null)
					os.close();
				if (is != null)
					is.close();
				if (sock != null)
					sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
}
