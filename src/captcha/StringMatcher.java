package captcha;

public class StringMatcher {

	private int answerPTR = 0;
	private int userInputPTR = 0;
	private String userInput = "";
	private String answer = "";
	
	
	public StringMatcher(String userInput, String answer) {
		this.answer = answer;
		this.userInput = userInput;
	}

	/**
	 * checkStrings: compares the correct string and the user inputed string to determine whether the input string is correct
	 * @return boolean 
	 */
	public boolean checkStrings() {

		while (answerPTR < answer.length() && userInputPTR < userInput.length()) {

			if (answer.charAt(answerPTR) != userInput.charAt(userInputPTR)) {
				System.out.println("Your input did not match.");
				return false;
			}
			++answerPTR;
			++userInputPTR;
		}
		
		return true;
	}

}
