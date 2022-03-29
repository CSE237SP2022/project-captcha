package captcha;
import java.util.Scanner; // Import the Scanner class
import java.io.*;
import edu.princeton.cs.introcs.StdDraw;
import captcha.Prompt;

public class UserInput {
		String userInput;
	
		
	public UserInput() {
		this.userInput = userInput;
		
		Prompt prompt_object = new Prompt();
		prompt_object.render();
//		System.out.println("Here");
		
//	  	String captcha = prompt_object.getAnswer();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
		
	    userInput = myObj.nextLine();  // Read user input 
	    System.out.println("The user inputed: " + userInput);  // Output user input
	}
	    
	public String getUserInput() {
    	return userInput;
    }
	
	public static void main(String[] args) {
		UserInput new_user_input = new UserInput();
		String user_input_result = new_user_input.getUserInput();
		// TODO: bring the user_input_result into a class to check for its validity
		System.out.println(user_input_result);
	}
}

