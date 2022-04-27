package captcha;

import java.util.Scanner; // Import the Scanner class
import java.io.*;
import captcha.Prompt;

public class UserInput {
	private String userInput;
	private int difficulty;
	private String answer;
	
	public UserInput(int difficulty) {
		this.userInput = "";
		this.answer = "";
		this.difficulty = difficulty;
	}
	
	public int getDifficulty() {
		return difficulty;
	}

	public boolean promptUser() {
		
		Prompt prompt_object = new Prompt(difficulty);
		prompt_object.render();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Type your input here");
		setUserInput(myObj.nextLine()); // Read user input
		answer = prompt_object.getAnswer();
		
		return check(answer);
		
	}

	private boolean check(String answer) {
		
		StringMatcher myStringMatcher = new StringMatcher(userInput, answer);
		if (myStringMatcher.checkStrings() == true) {
			System.out.println("Your input was correct. Good job!");
			difficulty++;
			return true;
		}
		else {
			return false;
			//promptUser();
		}
		
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
