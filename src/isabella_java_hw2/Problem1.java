// GRADE: 9/10 (A)

// SMALL BUG: what happens when you run with a string, and then with a number?  Consider switching to a while loop to avoid (should not call main() inside main function anyways)

package isabella_java_hw2;
import java.util.Scanner;

public class Problem1 {
	
	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) { 
				return false;	
			}
	    }
	    return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/* Asks user for input and prints what it equals */
		Scanner input = new Scanner(System.in);
		String user_input;
		while (true) {
			System.out.println("Enter a unicode code point, and I'll print out a report");
			user_input = input.nextLine();
						
			if (!isNumeric(user_input)) {
				System.out.println("That is not a number, please enter a number and try again.");
				
			} else {
				break;
			}
		}
		int amount_int = Integer.parseInt(user_input);
		char ch = (char) amount_int;	
		System.out.print(user_input + " represents the character: '" + ch + "'");
		
		/* Conditional to tell what kind of character it is. */		
		if (Character.isLetter(ch)) {
			System.out.print("\nThe character is a letter."); 
		} else if (Character.isDigit(ch)) {
			System.out.print("\nThe character is a number.");
		} else { 
			System.out.print("\nThe characters is alphanumeric.");
		}
			
		/* Next character. */
		int amount_plus_1 = amount_int + 1;
		char ch_amount_plus_1 = (char) amount_plus_1;
		System.out.print("\nThe next character is '" + ch_amount_plus_1 + "'.");
	
		/* Previous character. */
		int amount_minus_1 = amount_int - 1;
		char ch_amount_minus_1 = (char) amount_minus_1;
		System.out.print("\nThe previous character is '" + ch_amount_minus_1 + "'.");	
	}
}
