package checker;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String original;
		Scanner input = new Scanner(System.in);
		original = input.nextLine().trim();
		Punctuation p = new Punctuation();
		Comma c = new Comma();
		for(int i = 0; i < original.length(); i++)
		{
			switch(original.charAt(i))
			{
			case ' ': p.whiteSpace();
			break;
			case ',': 
				{
					c.commaHandler(i);
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
					c.resetComma();
					p.insertChar(original.charAt(i));
				}
			break;
			default: 
				{
					p.addSpaceAfter(i);
					p.insertChar(original.charAt(i));
				}
			}
		}
		
		p.getRes();
		input.close();
	}

}
