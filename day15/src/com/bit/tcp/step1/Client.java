package com.bit.tcp.step1;

import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		Socket sock = null;
		InetAddress inet = null;
		
		try {
			inet = InetAddress.getByAddress(new byte[] {127,0,0,1});
			sock = new Socket(inet, 5000);
			
			sock.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
