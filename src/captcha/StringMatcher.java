package captcha;

public class StringMatcher {

	public String answer; 
	public String userInput; 
	
	public int answerPTR = 0;
	public int userInputPTR = 0;  
	
	public void setAnswer(String answer) {
		this.answer = answer; 
	}
	
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	public String getAnswer() {
		return answer; 
	}
	
	public String getUserInput() {
		return userInput; 
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
