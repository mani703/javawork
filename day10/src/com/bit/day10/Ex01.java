/**
 * boxing 작업을 거친 후 object(객체) 형태로 값이 들어간다
 * 
 * 이론적으로는 순서가 없다.
 * HashSet - Hash 함수로 순서 정렬
 * TreeSet - 2진 Tree로 순서 정렬
 * 
 * TreeSet 문자열 순서 기준 - 첫, 두, 세 의 유니코드 비교
 * HashSet 숫자 순서 기준 - hashCode()메소드를 호출해서 해시 코드 있는지 없는지 비교
 * 					
 */

package com.bit.day10;

public class Ex01 {

	public static void main(String[] args) {
		// Set 타입의 자료구조 (순서가 없는 자료구조)
		// 이론적 : 순서(x), 중복(x) -> 실질적 : 순서(o), 중복(x)
		// 중복을 허용하지 않는 자료구조
		java.util.Set set1 = new java.util.HashSet();
		System.out.println("1." + set1.add(1111));
		System.out.println("2." + set1.add(2222));
		System.out.println("3." + set1.add(3333));
		System.out.println("4." + set1.add(2222));
		System.out.println("5." + set1.add(1111));
		
//		java.util.Set set1 = new java.util.TreeSet();
//		System.out.println("1." + set1.add("첫번째"));
//		System.out.println("2." + set1.add("두번째"));
//		System.out.println("3." + set1.add("세번째"));
//		System.out.println("4." + set1.add("두번째"));
//		System.out.println("5." + set1.add("첫번째"));
		java.util.Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
