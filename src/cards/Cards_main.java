package cards;

public class Cards_main {
	/**
	 * 
	 * @param args
	 * Calling the initialize method to initialize the deck.
	 * Calling the distribute method to distribute cards among four players
	 * calling the display method to display the cards distributed among four players
	 */
	public static void main(String[] args) {
		Cards_func cf = new Cards_func();
		cf.initialize_cards();
		cf.distribute_cards();
		cf.display_cards();
	}

}
