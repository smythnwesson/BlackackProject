package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	protected List<Card> cards = new ArrayList<>();
	
public Hand() {
	
}

public void addCard(Card card) {
	cards.add(card);
}
public void clearHand() {
	cards.clear();
}
public int getHandValue() {
	int counter = 0;
	for (Card card : cards) {
		counter += card.getValue();
	}
	return 0;
}

public void blackjackHand() {
	
}

public boolean isBlackjack() {
return true;	
}

public boolean isBust() {
	return false;
}



@Override
public String toString() {
	return "Hand [cards=" + cards + "]";
}

}
