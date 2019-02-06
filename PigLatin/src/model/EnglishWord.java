package model;

public class EnglishWord {
	
	private String word;
	private boolean validWord;
	
	EnglishWord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EnglishWord(String word) {
		super();
		setWord(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		validateWord(word);
		this.word = word;
	}
	
	public boolean getValidWord() {
		return this.validWord;
	}
	
	private void validateWord(String word) {
		
		if(word == null) {
			this.validWord = false;
		} else if(word.isEmpty()) {
			this.validWord = false;
		} else if(word.contains(" ")) {
			this.validWord = false;
		} else {
			this.validWord = true;
		}
	}
	
	public String translateToPigLatin() {
		
		if(this.validWord) {
			String translatedWord = 
					this.word.substring(1,2).toUpperCase() +
					this.word.substring(2).toLowerCase() +
					this.word.substring(0,1).toLowerCase() +
					"ay";
			
			return translatedWord;
			
		} else {
			return this.word;
		}
	}
	
}
