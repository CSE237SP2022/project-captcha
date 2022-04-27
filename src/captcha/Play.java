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
	/**
	 * getDifficulty: gets the difficulty value
	 * @return int difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * getfirstLevel: gets the status of the first difficulty level
	 * @return boolean
	 */
	public boolean getfirstLevel() {
		return firstLevel;
	}
	/**
	 * getsecondLevel: gets the status of the second difficulty level
	 * @return boolean
	 */
	public boolean getsecondLevel() {
		return secondLevel;
	}
	/**
	 * getthirdLevel: gets the status of the second diffculty level
	 * @return boolean
	 */
	public boolean getthirdLevel() {
		return thirdLevel;
	}
	/**
	 * getisFailed: gets this status of whether the difficulty level was failed
	 * @return boolean
	 */
	public boolean getisFailed() {
		return isFailed;
	}
	/**
	 * advance: determines whether the user can move on to the next difficulty level based on the status of their previous captcha level
	 */
	public void advance() {
		while(difficulty <= 3){
			System.out.println("Difficulty in advance: " + difficulty);
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
		}
	}
}
