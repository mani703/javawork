package com.bit.day09;

import java.util.LinkedList;

class Node {
	int val;
	Node nxt;
}

class BitLinked {
	Node start;
	int cnt = 0;
	
	public void add(int su) {
		cnt++;
		Node node = new Node();
		node.val = su;

		if(cnt == 1) {
			start = node;
		} else {
			Node temp = start;
			while(true) {
				if(temp.nxt == null) break;
				else temp = temp.nxt;
			}
			temp.nxt = node;
		}
		
		// 2.start.nxt = node;
		// 3.start.nxt.nxt = node;
		// 4.start.nxt.nxt.nxt = node;
	}
	
	public int get(int idx) {
		Node temp = start;
		for(int i=0; i<idx; i++) {
			temp = temp.nxt;
		}
		return temp.val;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		for(int i=0; i<4; i++) {
			System.out.println(list.get(i));
		}
	}

}
