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
	
	private enum FontType { 
		TimesNewRoman, 
		ChalkBoard, 
		LucidaHandwriting,
		Braggadocio,
	}
	
	enum FontSize { 
		Small, // 12 
		Medium, // 16 
		Large, // 24 
		ExtraLarge // 48 
	}
	
	public FontType getRandomFontType() {
		return FontType.values()[new Random().nextInt(FontType.values().length)];
	}
	
	public FontSize getRandomFontSize() {
		return FontSize.values()[new Random().nextInt(FontSize.values().length)];
	}
	
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
	
	private int assignNumber(FontSize f) {
		if(f == FontSize.Small) {
			return 12; 
		}
		else if(f == FontSize.Medium) {
			return 16; 
		}
		else if(f == FontSize.Large) {
			return 24; 
		}
		else {
			return 48; 
		}
	}
	
	public SpecialCharacters(int stringLen) {
		this.stringLen = stringLen;
	}
	
	public ArrayList<Font> randomizer() {
		ArrayList<Font> fontArray = new ArrayList<Font>();
		for(int i = 0; i < stringLen; ++i) {
			Font myFont = new Font(assignStringValue(getRandomFontType()), Font.BOLD, assignNumber(getRandomFontSize())); 
			fontArray.add(myFont); 
		}
		return fontArray;
	}

}
