package com.bit.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex03 {

	public Ex03() {
		
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		WindowAdapter listener = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		};
		f.addWindowListener(listener);
		f.setSize(500, 400);
		f.setLocation(100, 100);
		f.setVisible(true);
		
		Panel p = new Panel();
		TextField tf = new TextField(20);
		
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				f.dispose();
				System.out.println(tf.getText());
			}
		};
		
		ActionListener listener3 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				f.dispose();
				System.out.println(tf.getText());
				tf.setText(" ");
				tf.setText("");
			}
		};
		tf.addActionListener(listener3);
		p.add(tf);
		
		Button btn = new Button("exit");
		btn.addActionListener(listener2);
		p.add(btn);
		
		f.add(p);
		f.repaint();
//		f.validate();
//		f.revalidate();
	}

}
