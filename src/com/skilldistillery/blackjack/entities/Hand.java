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
	cards.removeAll(cards);
}
public int getHandValue() {
	int counter = 0;
	for (Card card : cards) {
		counter += card.getValue();
	}
	return counter;
}

public void blackjackHand() {
	
}

public boolean isBlackjack() {
	if(getHandValue() == 21) {
		System.out.println("BLACKJACK!!");
	}
	return true;
}

public boolean isBust() {
	if(getHandValue() > 21) {
		System.out.println("BUST!!");
	}
	return true;
}



@Override
public String toString() {
	return "Hand [cards=" + cards + "]";
}

}
