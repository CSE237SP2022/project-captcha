package captcha;

import java.util.Scanner; // Import the Scanner class
import java.io.*;
import edu.princeton.cs.introcs.StdDraw;
import captcha.Prompt;

public class UserInput {
	private String userInput;
	private String answer;
	
	public UserInput() {
		this.userInput = "";
		this.answer = "";
	}

	public void promptUser() {
		
		Prompt prompt_object = new Prompt();
		prompt_object.render();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Type your input here");
		setUserInput(myObj.nextLine()); // Read user input

		answer = prompt_object.getAnswer();
		check(prompt_object.getAnswer());
		
	}

	private void check(String answer) {
		StringMatcher myStringMatcher = new StringMatcher(userInput, answer);
		if (myStringMatcher.checkStrings() == true) {
			System.out.println("Your input was correct. Good job!");
			return;
		}
		promptUser();
	}

	public String getUserInput() {
		return userInput;
	}
	
	public void setUserInput(String value) {
		userInput = value;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String value) {
		answer = value;
	}
	

}
