package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	protected Hand playerHand;
	Dealer dealer;
	
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public boolean playerTurn() {
// Player needs to receive cards and play their turn. prompt to hit or stay and calculate their card sum
// Continue to loop until player stays or busts
		boolean keepGoing = true;
		do {

			System.out.println("Would you like to hit or stay?");
			String userInput = sc.nextLine();
			if (userInput.equalsIgnoreCase("hit")) {
				dealer.dealToPlayer();
				if(playerHand.isBust()) {
					System.out.println("bust");
					return true;
				}
				if(playerHand.isBlackjack()) {
					System.out.println("blackjack");
					return true;
				}
				
			} else if (userInput.equalsIgnoreCase("stay")) {
				System.out.println("It is now the dealers turn.");
				keepGoing = false;
				
				return false;
			}
		} while (keepGoing);
		return false;
	}

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

}
