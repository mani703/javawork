package com.bit.tcp.step1;

import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve = null;
		
		try {
			serve = new ServerSocket(5000);
			System.out.println("접속대기...");
			serve.accept();	// 들어올 때까지 접속대기
			System.out.println("누군가 들어옴...");
			
			serve.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
