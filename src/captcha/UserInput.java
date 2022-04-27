package captcha;

import java.util.Scanner;
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
	/**
	 * getDifficulty: gets the difficulty value
	 * @return int difficulty value
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * promptUser: prompts the user for their input
	 * @return boolean value
	 */
	public boolean promptUser() {
		
		Prompt prompt_object = new Prompt(difficulty);
		prompt_object.render();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Type your input here");
		setUserInput(myObj.nextLine()); // Read user input
		answer = prompt_object.getAnswer();
		
		return check(answer);
		
	}
	/**
	 * check: takes in the answer from user input and checks whether it is correct
	 * @param answer
	 * @return boolean 
	 */
	private boolean check(String answer) {
		
		StringMatcher myStringMatcher = new StringMatcher(userInput, answer);
		if (myStringMatcher.checkStrings() == true) {
			System.out.println("Your input was correct. Good job!");
			difficulty++;
			return true;
		}
		else {
			return false;
			
		}
		
	}
	/**
	 * getUserInput: gets the input typed in by the user
	 * @return String userInput
	 */
	public String getUserInput() {
		return userInput;
	}
	/**
	 * setUserInput: takes in a String value and sets the user input to value
	 * @param value
	 */
	public void setUserInput(String value) {
		userInput = value;
	}
	/**
	 * getAnswer: gets the answer 
	 * @return String answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * setAnswer: takes in a String value and sets the answer to value
	 * @param value
	 */
	public void setAnswer(String value) {
		answer = value;
	}
	

	

}
