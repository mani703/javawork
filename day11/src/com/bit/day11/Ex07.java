/**
 * 동일한 이름일지라도 가운데 이름은 랜덤하게 만들어준다
 */

package com.bit.day11;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File file = null;
		
		try {
			file = File.createTempFile("abcdefg", ".txt");
			System.out.println(file.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
