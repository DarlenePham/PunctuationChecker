package checker;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String original;
		Scanner input = new Scanner(System.in);
		original = input.nextLine().trim();
		Punctuation p = new Punctuation();
		Comma c = new Comma();
		Colon cl = new Colon();
		for(int i = 0; i < original.length(); i++)
		{
			switch(original.charAt(i))
			{
			case ' ': p.whiteSpace();
			break;
			case ',': 
				{
					c.commaHandler();
					c.countComma();
				}
			break;
			case 'a': 
				{
					c.addCommaForAnd(i, original);
					p.insertChar(original.charAt(i));
				}
			break;
			case '.': 
				{
					cl.colonHandler();
					c.resetComma();
				}
			break;
			default: 
				{
					p.addSpaceAfter();
					p.insertChar(original.charAt(i));
					cl.capitalizeLetter();
				}
			}
		}
		
		p.getRes();
		input.close();
	}

}
