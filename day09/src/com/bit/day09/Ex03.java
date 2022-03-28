package com.bit.day09;

public class Ex03 {

	public static void main(String[] args) {
//		BitQueue queue = new BitArray();
		BitStack stack = new BitArray();
		
//		queue.add("첫번째");
//		queue.add("두번째");
//		queue.add("세번째");
//		queue.add("네번째");
		
		stack.add("첫번째");
		stack.add("두번째");
		stack.add("세번째");
		stack.add("네번째");
		
		while(true) {
//			Object obj = queue.poll();
			Object obj = stack.pop();
			if(obj == null) break;
			System.out.println(obj);
		}
	}

}
