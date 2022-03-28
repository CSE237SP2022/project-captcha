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
import javax.swing.event.DocumentListener;

import java.lang.Object;
import java.awt.Graphics;


public class UserInput {
	public String userInput;
	public UserInput() {
		this.userInput = userInput;
	}
	public void displayCaptcha() {

//JFrame info from https://www.tutorialspoint.com/what-is-the-use-of-setbounds-method-in-java
	    JFrame frame = new JFrame("SetBounds Method Test");
	      frame.setSize(375, 250);
	      // Setting layout as null
	      frame.setLayout(null);
	      // Creating Button
	      JTextField myArea = new JTextField("hello");
	      JButton button = new JButton("hello");
	      
	      // Setting position and size of a button
	      myArea.setBounds(80,30,120,40);
	      button.setBounds(80,90,120,40);
	      
	      frame.add(myArea);
	      //Citations from button listening https://stackoverflow.com/questions/21879243/how-to-create-on-click-event-for-buttons-in-swing
	      button.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  userInput = myArea.getText();
	              System.out.println("userInput");
	          }
	      });
	      frame.add(button);
	      
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setLocationRelativeTo(null);
	      frame.setVisible(true);
	}
}
