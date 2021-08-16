package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	// I need a Player
	Player newPlayer = new Player();
	// I need a Dealer
	Dealer blackJackDealer = new Dealer(newPlayer);
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		BlackjackApp bja = new BlackjackApp();
		bja.setup();
		bja.run();
	}

	public void run() {
		boolean keepGoing = true;
		do {
			blackJackDealer.shuffleDeck();
			blackJackDealer.initialDeal();
			boolean gameStatus = newPlayer.playerTurn();
			if (!gameStatus) {
				blackJackDealer.dealerTurn();
			}
			gameResult();
			blackJackDealer.getDeck().addCardsToDeck(blackJackDealer.getHand().clearHand());
			blackJackDealer.getDeck().addCardsToDeck(newPlayer.getPlayerHand().clearHand());
			System.out.println("Would you like to play again? Y for yes N for no: ");
			String userInput = kb.nextLine();
			kb.nextLine();
			if(userInput.equalsIgnoreCase ("Y")) {
				keepGoing = true;
			}else if(userInput.equalsIgnoreCase ("N")) {
				keepGoing = false;
			}
		} while (keepGoing);

	}

	public void setup() {
		newPlayer.setDealer(blackJackDealer);
	}

	public void gameResult() {
		if (newPlayer.getPlayerHand().getHandValue() > blackJackDealer.getHand().getHandValue()
				&& newPlayer.getPlayerHand().getHandValue() < 22) {
			System.out.println("YOU WIN!!!");
		} else if (newPlayer.getPlayerHand().getHandValue() == blackJackDealer.getHand().getHandValue()) {
			System.out.println("You tie");
		} else if (blackJackDealer.getHand().getHandValue() < 22) {
			System.out.println("LOSER!!!");
		} else if (blackJackDealer.getHand().getHandValue() > 21) {
			System.out.println("DEALER BUSTS! YOU WIN!!");
		}
	}

}
