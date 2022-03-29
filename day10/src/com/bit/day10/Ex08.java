/**
 * Object Casting 없이 저장할 수 있다.
 * 
 * 클래스 타입만 가능 (Integer)
 */

package com.bit.day10;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		List<Number> list = new ArrayList<Number>();
		list.add(1111);
		list.add(2222);
		list.add(3.14);
//		list.add("3333");
		
//		for(int i=0; i<list.size(); i++) {
//			Number obj = list.get(i);
//		}
		
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("String", 3.14);
		map.put("key", 1.23);
//		map.put(1234, 3.14);
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			double val = map.get(key);
		}
		
	}

}
