package com.bit.day08;

import java.util.Calendar;

public class Ex04 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(java.util.Calendar.YEAR));
		System.out.println(cal.get(java.util.Calendar.MONTH)+1 + "월");	// 0 ~ 11
		System.out.println(cal.get(java.util.Calendar.DATE) + "일");
		
		int day = cal.get(java.util.Calendar.DAY_OF_WEEK);	// 1 ~ 7
		switch (day) {
			case java.util.Calendar.SUNDAY:
				System.out.println();
				break;
			case java.util.Calendar.MONDAY:
				System.out.println();
				break;
			default:
				break;
		}
		
		System.out.println(cal.get(java.util.Calendar.AM_PM));
		System.out.println(cal.get(java.util.Calendar.HOUR) + "시");
		System.out.println(cal.get(java.util.Calendar.MINUTE) + "분");
		System.out.println(cal.get(java.util.Calendar.SECOND) + "초");
	}

}
