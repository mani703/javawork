/**
 * 따로 위치 이동 함수는 없다.
 * 경로이름을 바꾸면 바뀐다.
 */

package com.bit.day11;

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		File before = new File("ex02.txt");
		File after = new File("test02\\ex02.txt");
		
		boolean result = before.renameTo(after);
		System.out.println(result);
	}

}
