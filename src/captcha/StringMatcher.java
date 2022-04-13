package captcha;

public class StringMatcher {

	public static int answerPTR = 0;
	public static int userInputPTR = 0;

	public boolean checkStrings() { // What should the arguments be here?

		while (answerPTR < Prompt.answer.length() && userInputPTR < UserInput.userInput.length()) {

			if (Prompt.answer.charAt(answerPTR) != UserInput.userInput.charAt(userInputPTR)) {
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
