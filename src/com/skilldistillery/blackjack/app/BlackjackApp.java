package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player newPlayer = new Player();
	Dealer blackJackDealer = new Dealer();
	
	public static void main(String[] args) {
		
		BlackjackApp bja = new BlackjackApp();
		bja.run();
	}
	
	public void run() {
		
		blackJackDealer.shuffleDeck();
		blackJackDealer.dealToPlayer();
		blackJackDealer.dealToDealer();
		newPlayer.playerTurn();
		blackJackDealer.dealerTurn();
		blackJackDealer.shuffleDeck();
		
		
		
		//I need a Dealer
		//I need a Player
		//Determine the rules of the game
		
	}

}
