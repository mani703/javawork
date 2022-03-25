package com.bit.day08;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06 {

	public static void main(String[] args) {
		// 2022년 오늘이 몇일차 인지
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_YEAR) + "일");
		
		// 2월 25일로 부터 오늘 며칠 지났는지...		
		GregorianCalendar cal1 = new GregorianCalendar(2022, 2-1, 25);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR) - cal1.get(Calendar.DAY_OF_YEAR) + "일");
	}

}
