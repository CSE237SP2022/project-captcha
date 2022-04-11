package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import captcha.Prompt;
import captcha.StringMatcher;
import captcha.UserInput;

class CaptchaTest {

	private UserInput myUserInput;

	@BeforeEach
	void setup() {
		myUserInput = new UserInput();
	}
	
	@Test
	void testPromptGetAnswer() {
		Prompt user = new Prompt();
		//Checks for invalid characters in the randomized string
		assertFalse(user.getAnswer().matches(".*[`~!@#$%^&*()_-+=[]\"{}|;':,./<>?].*"));
	}
	
	@Test
	void testCheckStrings() {
		myUserInput.promptUser();
		StringMatcher myStringMatcher = new StringMatcher();	
		assertEquals(true, myStringMatcher.checkStrings());
	}
	
	@Test
	void testCaptcha() {
		Prompt user = new Prompt();
		myUserInput.promptUser();
		//Checks that user input matches the captcha
		assertEquals(user.getAnswer(), myUserInput.getUserInput());
	}
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
