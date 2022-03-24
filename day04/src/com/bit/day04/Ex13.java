package com.bit.day04;
class Car{
	public int speed;
	public final String model; //바뀔수 없음
	public String company;
	public int max;
	public String color;
	
	public Car(int max) {
		if (max<=150) this.model="모닝";
		else if(max<=180) this.model="K3";
		else if(max<=200) this.model="스포츠카";
		else this.model="몬냐";
		
		this.max=max;
		this.color="Pink";
	}
	public Car(String model, int max) {
		this.model=model;
		this.max=max;
		this.color="white";
	}
	public void speedUp() {
		if((this.speed+10)>this.max) speed=max;
		else speed+=10;
	}
	public void speedDown() {
		if((speed-15)<0) speed=0;
		else speed-=10;
	}
	public void showSpeed() {
		System.out.println(color+" 색을 가진 "+model+" 차의 현재 speed : "+speed);
	}
}
public class Ex13 {
	public static void main(String[] args) {
	Car myCar=new Car("BMW",150);
	myCar.max=155;
	myCar.showSpeed();
	for(int i=0;i<20;i++) {
		myCar.speedUp();
		myCar.showSpeed();
	}
	for(int i=0;i<20;i++) {
		myCar.speedDown();
		myCar.showSpeed();
	}
	
	myCar=new Car("스포츠카",200);
	myCar.color="Red";
	myCar.showSpeed();
	for(int i=0;i<20;i++) {
		myCar.speedUp();
		myCar.showSpeed();
	}
	for(int i=0;i<20;i++) {
		myCar.speedDown();
		myCar.showSpeed();
	}
	
	myCar=new Car(160);
	for(int i=0;i<20;i++) {
		myCar.speedUp();
		myCar.showSpeed();
	}
	for(int i=0;i<20;i++) {
		myCar.speedDown();
		myCar.showSpeed();
	}
	
	
	}
}
