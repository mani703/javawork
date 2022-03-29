package com.bit.day10;

class Lec11 {
	public static <T> Box<T> func(T obj) {
		Box<T> box = new Box<T>();
		box.setSu(obj);
		return box;
	}
}

public class Ex11 {

	public static void main(String[] args) {
		Box<BallPen> box = Lec11.<BallPen>func(new BallPen());
		BallPen pen = box.getSu();
		pen.drow();
	}

}
