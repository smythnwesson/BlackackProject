package com.skilldistillery.blackjack.entities;

import java.util.List;

public class Dealer {
	Deck newDeck = new Deck();
	Hand hand = new Hand();
	Player player;

	// dealer needs to be able to deal cards to himself from the deck and to the
	// player.

	public Dealer(Player player) {
		this.player = player;
	}

	public Dealer() {

	}

	public void initialDeal() {
		for (int i = 0; i < 2; i++) {
			dealToPlayer();
			dealToDealer();
		}
	}

	public void dealToDealer() {
		Card card = new Card();
		card = newDeck.dealCard();
		if (hand.getCards().size() > 0) {
			System.out.println("The dealer dealt themself a " + card);
		} else {
			System.out.println("The dealer dealt themself a face down card");
		}
		hand.addCard(card);
	}

	public void dealToPlayer() {
		Card card = new Card();

		card = newDeck.dealCard();
		player.getPlayerHand().addCard(card);
		System.out.println("You were dealt a " + card);
	}

	public void shuffleDeck() {
		// dealer shuffles the cards
		newDeck.shuffleCards();
	}

	public void dealerTurn() {
		// once player stays, the dealer will evaulate cards and if card value = < 17,
		// dealer will hit until above 17 or bust
		System.out.println(hand);
		boolean keepGoing = true;
		while(keepGoing)
		if (hand.getHandValue() >= 17 && hand.getHandValue() < 22) {
			System.out.println("The dealer decides to stay");
			keepGoing = false;
		} else if (hand.getHandValue() < 17) {
			System.out.println("The dealer decides to hit");
			dealToDealer();
			System.out.println(hand.getHandValue());
		} else {
			keepGoing = false;
		}

	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	public Deck getDeck() {
		return newDeck;
	}

}
