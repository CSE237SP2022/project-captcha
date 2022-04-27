
package captcha;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.*;

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
			
		int answer_length = (int) (Math.random() * (9 - 6)) + 6;
		
		if(difficulty == 2) {
			answer_length = (int) (Math.random() * (12 - 9)) + 12;
		}
		
		if(difficulty == 3) {
			answer_length = (int) (Math.random() * (15 - 12)) + 12;
		}
		
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
		StdDraw.clear();
		if(difficulty == 3) {
			DrawShapes shapes = new DrawShapes();
			shapes.render();
		}
		Font myFont = new Font("TimesNewRoman", Font.BOLD, 20); 
	
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setFont(myFont);
		SpecialCharacters myChars = new SpecialCharacters(answer.length()); 
		ArrayList<Font> myArray = myChars.randomizer(); 
		
		for(int i = 0; i < myArray.size(); ++i) {
			StdDraw.setFont(myArray.get(i));
			if(difficulty == 3) {
				double flip = Math.random();
				double rotation = 0;
				if(flip > .5) {
					rotation = Math.random() * 60;
				}
				
				else {
					rotation = (Math.random() * (360 - 290)) + 290;
				}
				StdDraw.text(0.05 + 0.052*i, 0.5, Character.toString(answer.charAt(i)), rotation);
			}
			else if(difficulty == 2) {
				double flip = Math.random();
				double rotation = 0;
				if(flip > .5) {
					rotation = Math.random() * 20;
				}
				
				else {
					rotation = (Math.random() * (360 - 340)) + 340;
				}
				
				StdDraw.text(0.1 + 0.045*i, 0.5, Character.toString(answer.charAt(i)), rotation);
			}
			else {
				StdDraw.text(0.2 + 0.05*i, 0.5, Character.toString(answer.charAt(i)));
			}			
		}
		System.out.println(answer); 
	}
	
}