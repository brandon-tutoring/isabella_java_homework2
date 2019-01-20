// make sure output is exactly as specified in the example output.  i.e. when I choose number 68 output should be:
// 68 represents the character: 'D'
// The character is a letter.
// The next character is 'E'.
// The previous character is 'C'.

// GRADE: 8.5/10 (B)

import java.util.Scanner;

public class Problem1 {
	
	public static boolean isNumeric(String str)
	{
    for (char c : str.toCharArray())
	    {
			// check indentation on line below
		       if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		//please remove auto generated commnets
		
		// TODO Auto-generated method stub
		
		/* Asks user for input and prints what it equals */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a unicode code point, and I'll print out a report.");
		
		// why variable name "amount" ?
		String amount = input.nextLine();
					
		if (isNumeric(amount) == false) {
			System.out.println("That is not a number, please enter a number and try again.");
			main(args);
		}
		
		// since this is only other case no need for an else statement, can just continue with logic of program
		// ie can remove the next line (will also increase speed, not making a second check to isNumberic since we already know it is numeric if it made it to this section of code)
		
		else if (isNumeric(amount) == true) {
				
		
			int amount_int = Integer.parseInt(amount);
			char ch = (char) amount_int;
			
			System.out.print(amount + " represents the character " + ch);
				
			
			// good use of commenting below.  
			// Make sure to check conditions when number is 0 (what happens when amount_minus_1 is negative ?  )
			// And also the upper limit on unicode points (what happens when amount_plus_1 is above this limit?)
			
			
			/* Previous characters. */
			int amount_minus_1 = amount_int - 1;
			char ch_amount_minus_1 = (char) amount_minus_1;
			System.out.print("\nThe previous character is " + ch_amount_minus_1);
				
			/* Next characters. */
			int amount_plus_1 = amount_int + 1;
			char ch_amount_plus_1 = (char) amount_plus_1;
			System.out.print("\nThe next character is " + ch_amount_plus_1);
				
				 
				
			/* Conditional to tell what kind of character it is. */
		
			if (Character.isLetter(ch)) {
				System.out.print("\nThe character is a letter."); 
			}
			else if (Character.isDigit(ch)) {
				System.out.print("\nThe character is a number.");
			}
				
			else { 
				System.out.print("\nThe characters is alphanumeric.");
			}
		}
	}
}
