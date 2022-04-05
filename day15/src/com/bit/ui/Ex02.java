package com.bit.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex02 extends Frame {

	public Ex02() {
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);	// new Font("폰트명", 스타일, 크기);
		
		Panel p = new Panel();
		Button btn = new Button("abcd");
		btn.setFont(font);
		
//		btn.setLabel("\uac00");
		p.add(btn);
		Label la = new Label();
		la.setText("abcd");
		p.add(la);
		
		TextField tf = new TextField("", 20);
		tf.setText("문자열\n다음글자");
		p.add(tf);
		
		TextArea ta = new TextArea("내용을 작성\n다음글자", 5, 10);
		p.add(ta);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox box1 = new Checkbox("aaaaa", cbg, true);
		p.add(box1);
		Checkbox box2 = new Checkbox("bbbbb", cbg, false);
		p.add(box2);
		Checkbox box3 = new Checkbox("ccccc", cbg, false);
		p.add(box3);
		System.out.println(box1.getState());
		
		Choice cho = new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.select(2);
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
		p.add(cho);
		
		List list = new List(3);
		list.add("1첫번째");
		list.add("2두번째");
		list.add("3세번째");
		list.add("4네번째");
		list.add("5다섯번째");
		System.out.println(list.getItem(1));
		System.out.println(list.getSelectedIndex());
		System.out.println(list.getSelectedItem());
		p.add(list);
		
		add(p);
		setSize(500, 400);
		setLocation(100, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
