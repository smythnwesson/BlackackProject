package com.skilldistillery.blackjack.entities;

public class Dealer {
	private Deck newDeck = new Deck();
	
	public void shuffleDeck() {
		newDeck.shuffleCards();
	}
	public void deal() {
		newDeck.dealCard();
	}
	
	public String showDealerCard() {
		System.out.println("The dealer has a " + "" + " of " + "");
		return null;
	}


	
	// dealer needs to be able to deal cards to himself from the deck and to the
	// player.

	// dealer asks the player if they want to hit or stay

	// once player stays, the dealer will evaulate cards and if card value = < 17,
	// dealer will hit until above 17 or bust

	// dealer calls shuffle to shuffle the cards

	// dealer needs to flip both cards for player but only one card for themself
}
