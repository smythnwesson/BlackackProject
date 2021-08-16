package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String suit) {
		this.name = suit;
	}

	@Override
	public String toString() {
		return name;
	}
}
