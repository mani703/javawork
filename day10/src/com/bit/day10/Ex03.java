package com.bit.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(2222);
		list.add(1111);
		System.out.println(list.toString());
		Set set = new HashSet();
		set.addAll(list);
//		set.clear();
		System.out.println(set.toString());
		System.out.println(set.contains(1111));
		System.out.println(set.contains(4444));
		list.add(4444);
		System.out.println(set.containsAll(list));
	}

}
