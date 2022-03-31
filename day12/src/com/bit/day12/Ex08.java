package com.bit.day12;

import java.io.*;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println(is.read() == 'a');
		System.out.println(is.read() == '\r');
		System.out.println(is.read() == '\n');
	}

}
