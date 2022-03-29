package captcha;
import captcha.Prompt;
import captcha.UserInput;

public class StringMatcher {

	public static int answerPTR = 0;
	public static int userInputPTR = 0;  
	
	public static boolean checkStrings() { // What should the arguments be here? 
		
		while(answerPTR < Prompt.answer.length() && userInputPTR < UserInput.userInput.length()) { 
			
			if(Prompt.answer.charAt(answerPTR) != UserInput.userInput.charAt(userInputPTR)) {
				return false; 
			}
			
			++answerPTR;
			++userInputPTR; 
			
		}
		
		return true; 
	}
	
	public static void main(String[] args) {
		Prompt myPrompt = new Prompt(); 
		myPrompt.render(); 
		UserInput myUserInput = new UserInput(); 
		myUserInput.promptUser(); 
		StringMatcher myStringMatcher = new StringMatcher();
		myStringMatcher.checkStrings(); 
		System.out.println("Result: " + checkStrings()); 
	}
	
	
}
