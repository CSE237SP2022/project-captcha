package captcha;

public class Main_Class {

	public static void main(String[] args) {
		int difficulty=1;
		
		while(difficulty < 3){
			UserInput myUserInput = new UserInput(difficulty);
			boolean advance = myUserInput.promptUser();
			if(advance == true) {
				difficulty++;
			}
			else {
				difficulty = 1;
			}
		}
	}
}