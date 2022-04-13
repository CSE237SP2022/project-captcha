package captcha;

import java.util.Scanner; // Import the Scanner class
import java.io.*;
import edu.princeton.cs.introcs.StdDraw;
import captcha.Prompt;

public class UserInput {
	public static String userInput;

	public UserInput() {
		UserInput.userInput = "";
	}

	public void promptUser() {
		
		Prompt prompt_object = new Prompt();
		prompt_object.render();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Type your input here");
		setUserInput(myObj.nextLine()); // Read user input

		check();
		
	}

	public void check() {
		StringMatcher myStringMatcher = new StringMatcher();
		if (myStringMatcher.checkStrings() == true) {
			System.out.println("Your input was correct. Good job!");
			return;
		}
		promptUser();
	}

	public static String getUserInput() {
		return userInput;
	}
	
	public static void setUserInput(String value) {
		userInput = value;
	}
	

}
