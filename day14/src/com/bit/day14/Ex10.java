package com.bit.day14;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex10 {

	public static void main(String[] args) {
		// 프로토콜://호스트:포트/파일?쿼리스트링#레퍼런스
		
		java.net.URL url = null;
		try {
			url = new URL("http://daum.net");
			System.out.println("프로토콜->" + url.getProtocol());
			System.out.println("호트스->" + url.getHost());
			System.out.println("포트->" + url.getPort());
			System.out.println("프로토콜이 사용하는 디폴트포트->" + url.getDefaultPort());
			System.out.println("파일->" + url.getFile());
			System.out.println("쿼리스트링->" + url.getQuery());
			System.out.println("엥커->" + url.getRef());
			System.out.println(url.getAuthority());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
