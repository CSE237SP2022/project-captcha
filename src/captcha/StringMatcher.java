package captcha;

public class StringMatcher {

	public String answer; 
	public String userInput; 
	
	public int answerPTR;
	public int userInputPTR; 
	
	public void setter() {
		this.answerPTR = 0; 
		this.userInputPTR = 0; 
	}
	
	public boolean checkStrings() { // What should the arguments be here? 
		
		while(answerPTR < answer.length() && userInputPTR < userInput.length()) { 
			
			if(answer.charAt(answerPTR) != userInput.charAt(userInputPTR)) {
				return false; 
			}
			
			++answerPTR;
			++userInputPTR; 
			
		}
		
		return true; 
	}
	
	
}
