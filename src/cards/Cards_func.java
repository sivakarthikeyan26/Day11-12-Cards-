package cards;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Cards_func {
	@SuppressWarnings("rawtypes")
	ArrayList deck = new ArrayList();
	Object[][] players = new Object[4][9];
	/*
	 * Fuction to distrubute cards among 4 players.
	 */
	public void initialize_cards() {
		String[] shape = {"Spade","Diamond","Hearts","Clubs"};
		String[] rank = {"1","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};
		for(int i=0;i<shape.length;i++) {
			for(int j=0; j<rank.length;j++) {
				String card= rank[j].concat(shape[i]);
				deck.add(card);
			}
		}
	}
	/*
	 * Method to distrubute cards amoong four players
	 */
	public void distribute_cards() {
		for(int i =0; i<4; i++) {
			for(int j=0; j<9; j++) {
				int rn =(int) (Math.floor(Math.random() * 10) % deck.size() + 1);
				players[i][j]=deck.get(rn);
				deck.remove(rn);
			}
		}
	}
	/*
	 * Method to display the cards obtained by four players
	 */
	public void display_cards() {
		for(int i=0; i<4; i++) {
			System.out.print("Player "+(i+1)+" cards :");
			for(int j=0; j<9; j++) {
				System.out.print(players[i][j]+" ");
			}
			System.out.println();
		}
	}
}
