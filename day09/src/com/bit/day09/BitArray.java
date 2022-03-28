package com.bit.day09;

public class BitArray implements BitQueue, BitStack{
	private Object[] arr = new Object[10];
	
	public void add(Object stu) {
		Object[] before = arr;
		arr = new Object[arr.length+1];
		System.arraycopy(before, 0, arr, 0, before.length);
		arr[arr.length-1] = stu;
	}
	
	public int size() {
		return arr.length;
	}
	
	public Object get(int idx) {
		return arr[idx];
	}
	
	public void set(int idx, Object obj) {
		arr[idx] = obj;
	}
	
	public void remove(int idx) {
		Object[] before = arr;
		arr = new Object[arr.length-1];
		for(int i=0; i<idx; i++) {
			arr[i] = before[i];
		}
		for(int i=idx; i<arr.length; i++) {
			arr[i] = before[i+1];
		}
	}
	
	public Object poll() {
		// queue
		// add로 넣고 poll로 꺼내는 구조
		if(size() == 0) return null;
		Object obj = arr[0];
		remove(0);
		return obj;
	}
	
	public Object pop() {
		// stack
		// add로 넣고 pop으로 꺼내는 구조
		if(size() == 0) return null;
		Object obj = arr[arr.length-1];
		remove(arr.length-1);
		return obj;
	}
}