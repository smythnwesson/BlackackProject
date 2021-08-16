package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	Player player;
	Dealer dealer;
	protected List<Card> cards = new ArrayList<>();

	public Hand() {

	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public List<Card> clearHand() {
		List<Card> currentHand = new ArrayList<>(cards);
		cards.removeAll(cards);
		return currentHand;
		
	}

	public int getHandValue() {
		int counter = 0;
		for (Card card : cards) {
			counter += card.getValue();
		}
		return counter;
	}

	public boolean isBlackjack() {
		if ((getHandValue() == 21) && (cards.size() == 2)) {
			return true;
		}
		return false;
	}
	public void checkBlackJack() {
		
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;
	}
	
	public List<Card> getCards(){
		return cards;
	}

	@Override
	public String toString() {
		return "The dealer has " + cards;
	}

}
