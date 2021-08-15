package com.skilldistillery.blackjack.entities;

public class Dealer {
	private Deck newDeck = new Deck();
	Hand hand = new Hand();
	
	// dealer needs to be able to deal cards to himself from the deck and to the
	// player.
	public void dealToDealer() {
		newDeck.dealCard();
	}
	public void dealToPlayer() {
		newDeck.dealCard();
	}
	
	public String showDealerCard() {
		// dealer needs to flip only one card for the dealer while keeping the other card hidden
		System.out.println("The dealer has a " + "" + " of " + "");
		return null;
	}

	public void shuffleDeck() {
		//dealer shuffles the cards
		newDeck.shuffleCards();
	}

	public void dealerTurn() {
		// once player stays, the dealer will evaulate cards and if card value = < 17,
		// dealer will hit until above 17 or bust
		if(hand.getHandValue() >= 17 && hand.getHandValue() < 22) {
			System.out.println("The dealer decides to stays");
		}else if(hand.getHandValue() < 17) {
			System.out.println("The dealer decides to hit");
			newDeck.dealCard();
		}else {
			System.out.println("The dealer bust. You win!");
		}
			
			
		
	}


	
}
