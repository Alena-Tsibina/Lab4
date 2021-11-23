package Listeners;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;


public class TextListener {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Это моё окно");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		// TODO Auto-generated method stub
		final JTextField name = new JTextField();
		final JTextField greeting = new JTextField();
		
		name.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				String str = name.getText();
				int length = str.length();
				greeting.setText("Привет, " + str + "! Длина твоего имени: " + length);
				if (length == 0 ) name.setBackground(new Color(255,255,255));
				else if (length < 5) name.setBackground(new Color(0,128,0));
				else if (length < 10) name.setBackground(new Color(255,255,0));
				else name.setBackground(new Color(255,0,0));
			}
		});
		
		frame.add(name, BorderLayout.NORTH);
		frame.add(greeting, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
