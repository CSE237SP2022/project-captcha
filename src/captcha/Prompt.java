package captcha;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
//import java.awt.TextField;
import javax.swing.event.DocumentListener;

import java.lang.Object;
import java.awt.Graphics;

public class Prompt {

	public String answer;

	public Prompt() {
		this.answer = "This is a CAPTcha";
	}

	public void randomize() {

		/*
		 * ArrayList<String> random = new ArrayList<String>();
		 * random.add("HEY HOW ARE YOU"); random.add("waIt A minute");
		 * random.add("I can't do that"); random.add("CherRy Pie");
		 * 
		 * for(String entry : random) {
		 * 
		 * }
		 */

	}

	
	public void paint(Graphics g)
	{	
	   g.drawString("abc", 30, 180);
	   g.dispose();
	}
	
	public void render() {
		// randomize();

		// Got the idea for using JFrame from this website:
		// https://www.tutorialspoint.com/what-is-the-use-of-setbounds-method-in-java
		JFrame frame = new JFrame("SetBounds Method Test");
		frame.setSize(400, 400);
		
		frame.setLayout(null);
		
		JTextField text = new JTextField("hello");
		JButton button = new JButton("hello");
		JLabel captcha = new JLabel(answer);

		text.setBounds(80, 90, 120, 40);
		button.setBounds(80, 150, 120, 40);
		captcha.setBounds(80, 30, 120, 40);

		frame.add(captcha);
		frame.add(text);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userInput = text.getText();
				System.out.println(userInput);
			}
		});

		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Prompt newprompt = new Prompt();
		
		newprompt.render();
	}

}
