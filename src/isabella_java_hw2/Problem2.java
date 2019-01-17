package isabella_java_hw2;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] available_cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Jack", "Ace"};  
		List suits = new Arraylist(\u2660, \u2665, \u2666, \u2663);
		System.out.println("Shuffling the deck!");
		java.util.Random random = new java.util.Random();
		int random_computer_card = random.nextInt(available_cards.length);
		System.out.println(available_cards[random_computer_card]);
	}
}
