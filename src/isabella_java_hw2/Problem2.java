package isabella_java_hw2;

import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] available_cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Jack", "Ace"};  
		List suits = new List("♠, ♥, ♦, ♣");
		System.out.println("Shuffling the deck!");
		java.util.Random random = new java.util.Random();
		int random_computer_card = random.nextInt(available_cards.length);
		System.out.println(available_cards[random_computer_card]);
	}
}