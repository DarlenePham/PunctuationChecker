package checker;

public class Comma extends Punctuation {
	private int count = 0;
	
	// Comma handler
	public void commaHandler() {
		countComma();
		deleteSpaceBefore();
		addComma();
	}
	
	// Add comma
	public void addComma() {
		insertChar(',');
	}
	
	// Check if the word is "and"
	public boolean andChecker(int i, String original) {
		if(Character.isWhitespace(original.charAt(i-1)) && Character.isWhitespace(original.charAt(i+3)))
			if(original.charAt(i+1) == 'n' && original.charAt(i+2) == 'd')
				return true;
		
		return false;
	}
	
	// Add a comma before "and" by grammar rules
	public void addCommaForAnd(int i, String original) {
		if(andChecker(i, original) && count > 0 && original.charAt(i-2) != ',')
		{
			result = result.substring(0, result.length()-1);
			addComma();
			addSpaceAfter();
		}
	}
	
	// Count comma
	public void countComma() {
		count++;
	}
	
	// Reset comma count
	public void resetComma() {
		count = 0;
	}
}
