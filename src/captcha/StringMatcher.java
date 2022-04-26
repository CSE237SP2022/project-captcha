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


	public boolean checkStrings() { // What should the arguments be here?

		while (answerPTR < answer.length() && userInputPTR < userInput.length()) {

			if (answer.charAt(answerPTR) != userInput.charAt(userInputPTR)) {
				System.out.println("Your input did not match. Please try again.");
				return false;
			}

			++answerPTR;
			++userInputPTR;

		}
		// System.out.println("Your input was correct. Good job!");
		return true;
	}

}
