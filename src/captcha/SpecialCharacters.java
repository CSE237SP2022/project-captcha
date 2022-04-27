
package captcha;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

// Works Cited: 
// https://stackoverflow.com/questions/1972392/pick-a-random-value-from-an-enum

public class SpecialCharacters { 
	FontType myFont = FontType.TimesNewRoman; 
	FontSize mySize = FontSize.Small; 
	private int stringLen = 0; 
	
	public SpecialCharacters(int stringLen) {
		this.stringLen = stringLen;
	}
	
	private enum FontType { 
		TimesNewRoman, 
		ChalkBoard, 
		LucidaHandwriting,
		Braggadocio,
	}
	
	enum FontSize { 
		Small, 
		Medium, 
		Large, 
		ExtraLarge  
	}
	/**
	 * getRandomFontType: gets the random font type
	 * @return FontType
	 */
	public FontType getRandomFontType() {
		return FontType.values()[new Random().nextInt(FontType.values().length)];
	}
	/**
	 * getRandomFontSize: gets the random font size 
	 * @return FontSize
	 */
	public FontSize getRandomFontSize() {
		return FontSize.values()[new Random().nextInt(FontSize.values().length)];
	}
	/**
	 * assignStringValue: takes in a FontType t and assigns it to the the string value of the font type
	 * @param t
	 * @return String
	 */
	private String assignStringValue(FontType t) {
		if(t == FontType.TimesNewRoman) {
			return "TimesNewRoman"; 
		}
		else if(t == FontType.ChalkBoard) {
			return "ChalkBoard"; 
		}
		else if(t == FontType.LucidaHandwriting) {
			return "LucidaHandwriting"; 
		}
		else {
			return "Braggadocio"; 
		}
	}
	/**
	 * assignNumber: takes in a FontSize f and assigns it to the numerical value of the font size
	 * @param f
	 * @return int 
	 */
	private int assignNumber(FontSize f) {
		if(f == FontSize.Small) {
			return 14; 
		}
		else if(f == FontSize.Medium) {
			return 22; 
		}
		else if(f == FontSize.Large) {
			return 30; 
		}
		else {
			return 52; 
		}
	}
	/**
	 * randomizer: randomizes the font type and size of a character and stores it into an arraylist of type Font
	 * @return ArrayList<Font> fontArray
	 */
	public ArrayList<Font> randomizer() {
		ArrayList<Font> fontArray = new ArrayList<Font>();
		for(int i = 0; i < stringLen; ++i) {
			Font myFont = new Font(assignStringValue(getRandomFontType()), Font.BOLD, assignNumber(getRandomFontSize())); 
			fontArray.add(myFont); 
		}
		return fontArray;
	}

}
