package com.bit.day09;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Queue que = new LinkedList();
		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");
		
		while(que.peek() != null) {
			System.out.println(que.poll());
		}
//		while(true) {
//			Object obj = que.poll();
//			if(obj == null) break;
//			System.out.println(obj);
//		}
	}

}
