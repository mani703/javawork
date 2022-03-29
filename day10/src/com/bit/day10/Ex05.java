package com.bit.day10;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex05 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		System.out.println(list);
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {	// o1 = 이전값, o2 = 현재값
				return (int)o2 - (int)o1;
			}
			
		});
		System.out.println(list);
	}
}
