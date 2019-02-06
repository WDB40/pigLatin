package model;

public class PigLatinWord {
	
	private String word;
	private boolean validWord;
	
	PigLatinWord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PigLatinWord(String word) {
		super();
		this.setWord(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		validateWord(word);
		this.word = word;
	}

	public boolean isValidWord() {
		return validWord;
	}
	
	
	private void validateWord(String word) {
		
		if(word == null) {
			this.validWord = false;
		} else if(word.isEmpty()) {
			this.validWord = false;
		} else if(word.contains(" ")) {
			this.validWord = false;
		} else if(!word.substring(word.length() - 2).equals("ay")) {
			this.validWord = false;
		} else {
			this.validWord = true;
		}	
	}
	
	public String translateBackToEnglish() {
		
		if(this.validWord) {
			
			String translatedWord = 
					this.word.substring(word.length() - 3, word.length() - 2).toUpperCase() +
					this.word.substring(0, word.length() - 3).toLowerCase();
			
			return translatedWord;
		} else {
			return this.word;
		}
		
	}
}
