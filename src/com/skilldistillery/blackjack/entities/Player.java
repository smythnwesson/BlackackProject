package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	protected Hand playerHand;
	Dealer dealer = new Dealer();
	
	public void playerTurn() {
// Player needs to receive cards and play their turn. prompt to hit or stay and calculate their card sum
// Continue to loop until player stays or busts
		
		dealer.dealToPlayer();
		System.out.println("Would you like to hit or stay?");
		sc.next();
		if(sc.next().equalsIgnoreCase("hit")) {
			dealer.dealToPlayer();
		}
		if(sc.next().equalsIgnoreCase("stay")) {
			System.out.println("It is now the dealers turn.");
		}
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
