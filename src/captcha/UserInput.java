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
		
		System.out.println("SOMETHINGGGG");
		Prompt prompt_object = new Prompt();
		prompt_object.render();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		setUserInput(myObj.nextLine()); // Read user input
		
		System.out.println("The user inputed: " + userInput); // Output user input
		check();
		//myObj.close();
		System.out.println("After closing the input stream: " + userInput);
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
		System.out.println("Before setting it to a different value: " + userInput);
		return userInput;
	}
	
	public static void setUserInput(String value) {
		userInput = value;
		System.out.println("Before setting it to a different value: " + userInput);

	}
	

}
