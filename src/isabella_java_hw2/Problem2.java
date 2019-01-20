package isabella_java_hw2;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Problem2 {
	public static void main(String[] args) {
		
			
			String[] available_cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Jack", "Ace"};  
			String[] suits = {"♠", "♥", "♦", "♣"};
			System.out.println("Shuffling the deck!");
			java.util.Random random = new java.util.Random();
			int random_computer_card = random.nextInt(available_cards.length);
			int random_suit = random.nextInt(suits.length);
			System.out.println("Your card is:");
			System.out.print("Your card is the " + (random_computer_card) + " of " + random_suit + "s");

	}
}

