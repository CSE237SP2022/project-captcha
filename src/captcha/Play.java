package captcha;

public class Play {
	
	private int difficulty;
	private boolean firstLevel;
	private boolean secondLevel;
	private boolean thirdLevel;
	private boolean isFailed;
	
	public Play() {
		this.difficulty = 1;
		this.firstLevel = false;
		this.secondLevel = false;
		this.thirdLevel = false;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public boolean getfirstLevel() {
		return firstLevel;
	}
	
	public boolean getsecondLevel() {
		return secondLevel;
	}
	
	public boolean getthirdLevel() {
		return thirdLevel;
	}
	
	public boolean getisFailed() {
		return isFailed;
	}

	public void advance() {
		while(difficulty <= 3){
			UserInput myUserInput = new UserInput(difficulty);
			boolean advance = myUserInput.promptUser();
			if(advance == true) {
				if(difficulty == 1) {
					firstLevel = true;
				}
				else if(difficulty == 2) {
					secondLevel = true;
				}
				
				else if(difficulty == 3) {
					thirdLevel = true;
				}
				difficulty++;
			}
			else {
				isFailed = true;
				difficulty = 1;
			}
			System.out.println("difficulty:"+ difficulty);
		}
	}
}
