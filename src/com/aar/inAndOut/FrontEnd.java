package com.aar.inAndOut;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrontEnd {

	JFrame jf;
	
	FrontEnd(){
		
		jf = new JFrame("Mankatha");
		
		JButton b = new JButton("Play Game");
		b.setBounds(130, 100, 100, 40);
		
		jf.add(b);
		
		jf.setSize(400,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new FrontEnd();
		
		
	}
}
