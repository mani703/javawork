package com.bit.ui;

import java.awt.*;

import javax.swing.JFrame;

public class Ex01 {

	public static void main(String[] args) {
		// GUI
		// AWT - 운영체제 의존적 (운영체제가 지원해야 한다)
		// swing - 운영체제 종속성 없음 (자바가 직접 드로잉)
		
		// 배치관리자 - 컴포넌트 요소를 어떻게 화면에 위치와 크기를 알아서 결정
//		new FlowLayout();	 // 1.
//		new GridLayout();	 // 2.
//		new BorderLayout();	 // 3.	(동, 서, 남, 북)
//		new CardLayout();	 // 4.	(화면전환 용으로 많이 쓰임)
//		new GridBagLayout(); // 5.	오로지 자바에서만 추천x
		// 배치관리자 사용안함	 // 6.	직접적으로 각 컴포넌트 설정
		
		Frame f = new Frame();
		f.setSize(400, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		Panel p = new Panel();
//		p.setLayout(new FlowLayout());
//		p.setLayout(new GridLayout(2, 1));	// new GridLayout(세로, 가로);
//		p.setLayout(new BorderLayout());
		p.setLayout(null);
		Button btn = new Button();
		btn.setSize(100, 50);
		btn.setLocation(100, 100);
		btn.setLabel("first");
		p.add(btn);
		Button btn2 = new Button();
		btn2.setLabel("second");
		p.add(btn2);
		f.add(p);
	}

}
