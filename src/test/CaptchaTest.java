package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Font;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import captcha.Prompt;
import captcha.StringMatcher;
import captcha.UserInput;
import captcha.SpecialCharacters;

class CaptchaTest {

	private UserInput myUserInput;
	private Prompt user;
	@Test
	void testStringMatcher() {
		myUserInput = new UserInput(1);
		myUserInput.promptUser();
		StringMatcher myStringMatcher = new StringMatcher(myUserInput.getUserInput(), myUserInput.getAnswer());
		assertEquals(true, myStringMatcher.checkStrings());
	}
	
	@BeforeEach
	void setup() {
		myUserInput = new UserInput(1);
		user = new Prompt(1);
	}
	
//	@Test
//	void testPromptGetAnswer() {
//		assertEquals(user.getAnswer(),Prompt.answer);
//	}
	
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
	
//	@Test
//	void testGetUserInput() {
//		myUserInput.promptUser();
//		assertEquals(myUserInput.getUserInput(), myUserInput.userInput);
//	}
	
	@Test
	void testUserInputCheck() {
		myUserInput.promptUser();
		assertEquals(user.getAnswer(), myUserInput.getUserInput());
	}

	@Test
	void testDuplicateOfTwoInstances() {
		String s1 = user.getAnswer();
		SpecialCharacters testSpecialCharacters = new SpecialCharacters(s1.length());
		//first time call the randomizer
		ArrayList<Font> test1 = testSpecialCharacters.randomizer();
		ArrayList<Font> test2 = testSpecialCharacters.randomizer();
		for(int i = 0; i < test1.size(); i++) {
			assertFalse(test1.get(i).equals(test2.get(i)));
		}
	}
	
	
	

	
}