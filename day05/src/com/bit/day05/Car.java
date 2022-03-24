package com.bit.day05;

public class Car {
	public int speed;
	public String model;
	
	public Car(String model) {
		this.model=model;
		speed=0;
	}
	public void speedUp() {
		System.out.println(model+"이 달린다");
	}
}
