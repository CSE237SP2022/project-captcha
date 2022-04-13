package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import captcha.Prompt;
import captcha.StringMatcher;
import captcha.UserInput;

class CaptchaTest {

	private UserInput myUserInput;
	private Prompt user;
	@Test
	void testStringMatcher() {
		myUserInput = new UserInput();
		myUserInput.promptUser();
		StringMatcher myStringMatcher = new StringMatcher();
		assertEquals(true, myStringMatcher.checkStrings());
	}
	
	@BeforeEach
	void setup() {
		myUserInput = new UserInput();
		user = new Prompt();
	}
	
	@Test
	void testPromptGetAnswer() {
		assertEquals(user.getAnswer(),Prompt.answer);
	}
	
	@Test
	void testPromptRandomize() {
		String string1 = user.getAnswer();
		user.randomize();
		String string2 = user.getAnswer();
		assertFalse(string1.equals(string2));
	}
	
	@Test
	void testUserInputPromptUser() {
		myUserInput.promptUser();
		String string1 = "";
		assertFalse(string1.equals(myUserInput.getUserInput()));
	}
	
	@Test
	void testGetUserInput() {
		myUserInput.promptUser();
		assertEquals(myUserInput.getUserInput(), myUserInput.userInput);
	}
	
	@Test
	void testUserInputCheck() {
		myUserInput.promptUser();
		assertEquals(user.getAnswer(), myUserInput.getUserInput());
	}


	
	
	

	
}

