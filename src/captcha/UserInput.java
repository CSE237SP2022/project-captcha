package captcha;
import java.util.Scanner; // Import the Scanner class
import java.io.*;
import edu.princeton.cs.introcs.StdDraw;
import captcha.Prompt;

public class UserInput {
		String userInput;
		
	public void userInput() {
		this.userInput = userInput;
	
	  	String captcha = Prompt.getAnswer();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println(captcha);
		
	    userInput = myObj.nextLine();  // Read user input 
	    System.out.println("The user inputed: " + userInput);  // Output user input
	}
	    
	public String getUserInput() {
    	return userInput;
    }
}
