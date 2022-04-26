package captcha;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.*;
import captcha.SpecialCharacters;

public class Prompt {

	private String answer;
	private int difficulty;
	public Prompt(int difficulty) {
		this.answer = "";
		this.difficulty = difficulty;
	}

	public String getAnswer() {	
		return answer;
	}

	public void randomize() {

		String word_bank = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		
		int answer_length = (int) (Math.random() * (12 - 6)) + 6;
		
		String base_answer = "";
		
		for(int i = 0; i < answer_length; i++) {
			base_answer += i;
		}
		
		StringBuilder new_answer = new StringBuilder(base_answer);
		
		for(int i = 0; i < answer_length ; i++) {
		    int random = (int) Math.floor(Math.random() * word_bank.length());
			new_answer.setCharAt(i, word_bank.charAt(random));
		}
		
		answer = new_answer.toString();	
	}

	public void render() {
		randomize();
		Font myFont = new Font("TimesNewRoman", Font.BOLD, 20); 
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setFont(myFont);
		System.out.println(answer); 
		SpecialCharacters myChars = new SpecialCharacters(answer.length()); 
		ArrayList<Font> myArray = myChars.randomizer(); 
		for(int i = 0; i < myArray.size(); ++i) {
			StdDraw.setFont(myArray.get(i));
			StdDraw.text(0.2 + 0.05*i, 0.8, Character.toString(answer.charAt(i)));
		}
		// StdDraw.text(0.2, 0.8, Character.toString(answer.charAt(0)));
//		StdDraw.text(0.2, 0.8, answer); 
		System.out.println(answer); 

	}
	
}
