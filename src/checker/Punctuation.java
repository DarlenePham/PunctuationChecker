package checker;

public class Punctuation {
	protected static String result = "";
	private char[] spaceAfterPun = {',', '.', '!', ':', ';', '?', ')'};
	
	// Delete space before punctuation if necessary
	public void deleteSpaceBefore(int i) {
		if(Character.isWhitespace(result.charAt(result.length()-1)))
			result = result.substring(0, result.length()-1);
	}
	
	// Add space after character
	public void addSpaceAfter(int i) {
		for(char x : spaceAfterPun)
		{
			if(result != "" && result.charAt(result.length()-1) == x)
			{
				insertChar(' ');
			}
		}
	}
	
	// Check to see if white space is needed
	public void whiteSpace() {
		if(Character.isWhitespace(result.charAt(result.length()-1)))
			return;
		insertChar(' ');
	}
	
	// Insert new character to result
	public void insertChar(char c)
	{
		result += c;
	}
	
	// Get result
	public void getRes() {
		System.out.println(result);
	}
}
