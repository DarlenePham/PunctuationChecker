package checker;

public class Colon extends Punctuation {
	private int colonCount = 0;
	
	// Colon handler
	public void colonHandler() {
		deleteSpaceBefore();
		addColon();
		colonCount++;
	}
	
	// Add colon
	public void addColon() {
		insertChar('.');
	}
	
	// Capitalize letter
	public void capitalizeLetter() {
		if(colonCount > 0 && !Character.isUpperCase(result.charAt(result.length()-1)))
		{
			char temp;
			temp = Character.toUpperCase(result.charAt(result.length()-1));
			result = result.substring(0, result.length()-1);
			insertChar(temp);
		}
		colonCount = 0;
	}

}
