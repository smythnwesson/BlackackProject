package com.skilldistillery.blackjack.entities;

public class Player {
	protected Hand playerHand;

	
	public Player() {
		this.playerHand = new Hand();

	}


	public Hand getPlayerHand() {
		return playerHand;
	}


	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}
	
	public void addCardToHand(Card newCard) {
		playerHand.addCard(newCard);
	}


	@Override
	public String toString() {
		return "Player [playerHand=" + playerHand + "]";
	}
	
	
	

// Player needs to receive cards

//player needs to calculate sum of cards

//player is prompted to hit or stay. will keepGoing until player decides to stay

}
