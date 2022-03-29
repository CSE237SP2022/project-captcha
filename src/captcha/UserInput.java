package captcha;
import java.util.Scanner; // Import the Scanner class
import java.io.*;
import edu.princeton.cs.introcs.StdDraw;
import captcha.Prompt;

public class UserInput {
		public static String userInput;
	
		
	public UserInput() {
		this.userInput = userInput;
	}	
	
	public void promptUser() {
		Prompt prompt_object = new Prompt();
		prompt_object.render();
//		System.out.println("Here");

//		String captcha = prompt_object.getAnswer();
		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		userInput=myObj.nextLine(); // Read user input
		System.out.println("The user inputed: "+userInput); // Output user input
	}
	    
	public String getUserInput() {
    	return userInput;
    }
	
}

