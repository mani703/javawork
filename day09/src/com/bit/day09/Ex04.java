package com.bit.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.trimToSize();
		list1.add(1111);
		list1.add(2222);
		
		ArrayList list2 = new ArrayList(list1);
		System.out.println(list1 == list2);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("--------------------");
		// List
		// 순서가 있는(중복가능) 자료구조, 동적할당
		// crud
		ArrayList list4 = new ArrayList();
		list4.add(1111);
		list4.add(2222);
		list4.add(2, 3000);
		list4.add("세번째");
		list4.add(4444);
		list4.add(5555);
		list4.add(list4.size(), 6666);
		
		list4.set(2, 30);
		list4.remove(2);
		
		ArrayList list5 = new ArrayList();
		list5.add(0);
		list5.addAll(list4);
//		list5.clear();
		list5.removeAll(list1);
		list5.remove("세번째");
		
		List list6 = list5.subList(1, 3);
		System.out.println(list6.getClass());
		System.out.println(list4 == list5);
		
		System.out.println("---------------------");
		Object[] arr7 = list5.toArray();
//		int[] arr7 = (int[])(list5.toArray());
		System.out.println(Arrays.toString(arr7));
		int[] arr8 = new int[arr7.length];
		for(int i=0; i<arr8.length; i++) {
			arr8[i] = (int)arr7[i];
		}
		System.out.println(Arrays.toString(arr8));
	}
}
