package com.bit.day07;

public class Ex03 {

	public static void main(String[] args) {
		double su1 = 3.14;
		Double su2 = new Double("3.14");
		Double su3 = new Double(3.14);
		
		double su4 = Double.parseDouble("3.14");
		
		System.out.println(su2);
		
		double su5 = 0.0;
		double su6 = 0.0;
		System.out.println(su5/su6);
		System.out.println(Double.isInfinite(su5/su6));	// 1.0/0.0
		System.out.println(Double.isNaN(su5/su6));	// 0.0/0.0
		System.out.println(su4);
		
		float su7 = 3.14F;
		Float su8 = new Float(su7);
		Float su9 = new Float(3.14);
		Float su10 = new Float("3.14");
	}

}
