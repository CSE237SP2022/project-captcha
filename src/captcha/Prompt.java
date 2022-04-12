package captcha;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Prompt {

	public static String answer;

	public Prompt() {
		Prompt.answer = "";
	}

	public String getAnswer() {	
		return answer;
	}

	public static void randomize() {

		String word_bank = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
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
		
		Prompt.answer = new_answer.toString();	
	}

	public void render() {
		randomize();
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.2, 0.8, answer);

	}
}
