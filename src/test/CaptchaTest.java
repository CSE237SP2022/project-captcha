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
import captcha.Play;

class CaptchaTest {

	private UserInput myUserInput;
	private Prompt user;
	private Play testPlay;
	private StringMatcher testWrongInput;
	private StringMatcher testRightInput;
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
		testPlay = new Play();
		testWrongInput = new StringMatcher("aaa", "bbb");
		testRightInput = new StringMatcher("aaa", "aaa");
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
	void testUserInputCheck() {
		myUserInput.promptUser();
		assertFalse(user.getAnswer().equals(myUserInput.getUserInput()));
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
	
	@Test
	void testPlay() {
		testPlay.advance();
		System.out.println("getDifficulty(): " + testPlay.getDifficulty());
		assertTrue(testPlay.getDifficulty() < 5 && testPlay.getDifficulty() > 0);
		if (testPlay.getfirstLevel() && !testPlay.getthirdLevel()) {
			assertEquals(testPlay.getDifficulty(), 1);
			assertEquals(testPlay.getisFailed(), false);
			if (testPlay.getsecondLevel()) {
				assertEquals(testPlay.getDifficulty(), 2);
				assertEquals(testPlay.getisFailed(), false);
				if (testPlay.getthirdLevel()) {
					assertEquals(testPlay.getDifficulty(), 3);
					assertEquals(testPlay.getisFailed(), false);
				}
				else {
					assertEquals(testPlay.getDifficulty(), 1);
					assertEquals(testPlay.getisFailed(), true);			
				}
			}
			else {
				assertEquals(testPlay.getDifficulty(), 1);
				assertEquals(testPlay.getisFailed(), true);			
			}
		}
		else if (testPlay.getfirstLevel() && testPlay.getthirdLevel()) {
			// at the end, the difficulty was increased to 4 to break the while loop
			assertEquals(testPlay.getDifficulty(), 4);
			assertEquals(testPlay.getisFailed(), false);
		}
		else {
			assertEquals(testPlay.getDifficulty(), 1);
			assertEquals(testPlay.getisFailed(), true);			
		}
	}
	
	@Test
	void testGetDifficultyinPrompt() {
		assertEquals(user.getDifficulty(), 1);
	}
	
	@Test
	void testCheckString() {
		assertEquals(testRightInput.checkStrings(), true);
		assertEquals(testWrongInput.checkStrings(), false);
	}
	
	@Test
	void testGetterandSetterinUserInput() {
		myUserInput.setAnswer("hello");
		assertEquals("hello", myUserInput.getAnswer());
	}
}