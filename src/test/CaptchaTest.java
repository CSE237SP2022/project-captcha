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
		assertEquals("This is a CAPTcha", user.getAnswer());
	}
	
	@Test
	void testCheckStrings() {
		myUserInput.promptUser();
		StringMatcher myStringMatcher = new StringMatcher();	
		assertEquals(true, myStringMatcher.checkStrings());
	}
	
	@Test
	void testCaptcha() {	
		myUserInput.promptUser();
		assertEquals("This is a CAPTcha", myUserInput.getUserInput());
	}
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
