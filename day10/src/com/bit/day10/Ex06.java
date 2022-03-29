package com.bit.day10;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// Map은 Key와 value의 쌍으로 관리하는 자료구조
		// 입력시 반드시 key, value 쌍으로 입력한다
		// 키 순서에 의해 value 값 순서 결정
		// value -> 중복 허용
		// key -> 중복 불허
		// 동일 key -> 수정
		Map map1 = new HashMap();
		map1.put("첫번째", 1111);
		map1.put("두번째", 2222);
		map1.put("세번째", 3333);
		map1.put("네번째", 4444);
		map1.put("세번째", 3000);
		String[] msg = {"두번째", "첫번째", "세번째", "네번째"};
		for(int i=0; i<msg.length; i++) {
			System.out.println(map1.get(msg[i]));
		}
	}

}
