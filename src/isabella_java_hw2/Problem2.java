package isabella_java_hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
		

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				List<String> card_nums = new ArrayList <>();
				card_nums.add("A"); 
				card_nums.add("2");
				card_nums.add("3");
				card_nums.add("4");
				card_nums.add("5");
				card_nums.add("6");
				card_nums.add("7");
				card_nums.add("8");
				card_nums.add("9");
				card_nums.add("10");
				card_nums.add("J");
				card_nums.add("Q");
				card_nums.add("K");

				List<String> card_suits = new ArrayList <>();
				card_suits.add("♠");
				card_suits.add("♥");
				card_suits.add("♦");
				card_suits.add("♣");

				Random rand = new Random();
				String random_card_num = card_nums.get(rand.nextInt(card_nums.size()));
				
				String random_card_suit = card_suits.get(rand.nextInt(card_suits.size()));
				
				System.out.print("Your card is the " + (random_card_num) + " of " + random_card_suit + "s");
				
				
			}

		}