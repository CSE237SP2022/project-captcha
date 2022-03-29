package captcha;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Prompt {

	public static String answer;

	public Prompt() {
		Prompt.answer = "This is a CAPTcha";
	}

	public String getAnswer() {
		return answer;
	}

	public void randomize() {

		/*
		 * ArrayList<String> random = new ArrayList<String>();
		 * random.add("HEY HOW ARE YOU"); random.add("waIt A minute");
		 * random.add("I can't do that"); random.add("CherRy Pie");
		 * 
		 * for(String entry : random) {
		 * 
		 * }
		 */

	}

	public void render() {
		// randomize();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.2, 0.5, answer);

	}
}
